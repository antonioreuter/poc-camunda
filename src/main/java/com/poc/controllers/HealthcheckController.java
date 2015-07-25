package com.poc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by antonioreuter on 7/25/15.
 */

@RestController("healthcheck")
@RequestMapping("/healthcheck")
public class HealthcheckController {

    @RequestMapping(value="/alive", method= RequestMethod.GET)
    public String healthcheck() {
        return "OK";
    }

    @RequestMapping(value="/version", method= RequestMethod.GET)
    public String version() {
        return "1.0-SNAPSHOT";
    }

}
