package me.qinchao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sulvto on 16-5-14.
 */
@Controller
@RequestMapping("/HelloWorld")
public class HelloWorldController {

    @RequestMapping("/{name}")
    @ResponseBody
    String Hello(@PathVariable("name") String name) {
        return "{\"hello\":\"" + name + "\"}";
    }
}
