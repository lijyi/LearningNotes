package com.lijyi.learn.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liyang
 * @date 2019-08-09
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "/index"})
    public String index(Model model) {
        return "index";
    }
}