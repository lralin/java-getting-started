package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linrui.li
 * @create 2018年12月11日 17:00
 **/
@RestController
public class HelloController {
    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    String hello() {
        return "hello word";
    }
}
