package me.qinchao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sulvto on 16-5-14.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/{name}")
    @ResponseBody
    String Hello(@PathVariable("name") String name) {
        return "{\"hello\":\"" + name + "\"}";
    }
}
