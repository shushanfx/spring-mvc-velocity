package com.shushanfx.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/10/22 0022.
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/", "/index", "/home", "/index.html", "/home.html"}, method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
