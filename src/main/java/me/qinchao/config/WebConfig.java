package me.qinchao.config;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletListenerRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Filter;

/**
 * Created by sulvto on 16-5-16.
 */
@Configuration
public class WebConfig {
    @Bean
    FilterRegistrationBean filter() {
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
        filterRegistration.setFilter(new javax.servlet.Filter() {
            @Override
            public void init(FilterConfig filterConfig) throws ServletException {
                System.out.println("FilterRegistrationBean::init");

            }

            @Override
            public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
                System.out.println("FilterRegistrationBean::doFilter");
                filterChain.doFilter(servletRequest, servletResponse);
            }

            @Override
            public void destroy() {
                System.out.println("FilterRegistrationBean::destroy");
            }
        });
        return filterRegistration;
    }

    @Bean
    ServletListenerRegistrationBean servletListener() {
        ServletListenerRegistrationBean servletListenerRegistration = new ServletListenerRegistrationBean();
        servletListenerRegistration.setListener(new ServletContextListener() {
            @Override
            public void contextInitialized(ServletContextEvent servletContextEvent) {
                System.out.println("ServletListenerRegistrationBean::contextInitialized");
            }

            @Override
            public void contextDestroyed(ServletContextEvent servletContextEvent) {
                System.out.println("ServletListenerRegistrationBean::contextDestroyed");
            }
        });
        return servletListenerRegistration;

    }

}
