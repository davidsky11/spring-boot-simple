package com.kvlt.boot.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HelloController
 *
 * @author KVLT
 * @date 2017-12-20.
 */
@Controller
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "hello";
    }
}
