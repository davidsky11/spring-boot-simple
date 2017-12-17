package com.kvlt.boot.web;

import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * RestController
 *
 * @author KVLT
 * @date 2017-12-17.
 */
@Controller
public class DataController {

    @RestResource(path = "res", rel = "res")
    String res(@RequestParam("name") String name) {
        return "Hello : " + name;
    }

}
