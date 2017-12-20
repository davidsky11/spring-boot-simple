package com.kvlt.boot.web;

import com.kvlt.boot.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * HelloController
 *
 * @author KVLT
 * @date 2017-12-20.
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public ModelAndView index() {
        List<Person> pLs = new ArrayList<>();

        Person p1 = new Person(1, "周杰伦", "汉族");
        pLs.add(p1);

        Person p2 = new Person(2, "张学友", "汉族");
        pLs.add(p2);

        Person p3 = new Person(3, "马云", "汉族");
        pLs.add(p3);

        Person p4 = new Person(4, "刘强东", "汉族");
        pLs.add(p4);

        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("list", pLs);
        modelAndView.addObject("title", "Spring-boot With JSP");

        return modelAndView;
    }
}
