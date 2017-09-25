package com.example.api.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuwei on 2017/9/25.
 */
@RefreshScope
@RestController
public class ApiController {

    @Value("${from}")
    private String from;

    @RequestMapping(value = "/go", method = RequestMethod.GET)
    public String go() {
        return "ok";
    }

    @RequestMapping(value = "/from", method = RequestMethod.GET)
    public String from() {
        return from;
    }
}
