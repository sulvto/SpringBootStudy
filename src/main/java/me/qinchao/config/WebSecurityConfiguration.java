//package me.qinchao.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * Created by sulvto on 16-5-16.
// */
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//    public WebSecurityConfiguration() {
//        super(true);
//    }
//
//    @Override
//    public void init(WebSecurity web) {
//      web.ignoring().antMatchers("/**");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.exceptionHandling()
//                .and()
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/**")
//                .permitAll();
//    }
//
//}