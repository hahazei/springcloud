package com.example.api.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuwei on 2017/9/25.
 */
@RestController
public class ApiController {

    @RequestMapping(value = "/go", method = RequestMethod.GET)
    public String go() {
        return "ok";
    }
}
