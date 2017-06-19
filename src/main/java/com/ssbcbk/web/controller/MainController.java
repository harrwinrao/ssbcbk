package com.ssbcbk.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Harrwinrao Ramarao on 18/6/2017.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
