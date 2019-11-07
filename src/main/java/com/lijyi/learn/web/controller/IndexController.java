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

    String toc = "学习过程中整理的一些资料和代码\n" +
            "\n" +
            "\n" +
            "<!-- TOC -->\n" +
            "\n" +
            "- 第一部分：并发编程\n" +
            "    - [1.Java多线程](notes/cas-lock/1.Java%E5%A4%9A%E7%BA%BF%E7%A8%8B.md)\n" +
            "    - [2.Synchronized](notes/cas-lock/2.Synchronized.md)\n" +
            "    - [3.CAS](notes/cas-lock/3.CAS.md)\n" +
            "    - [4.AQS](notes/cas-lock/4.AQS.md)\n" +
            "    - [5.Lock](notes/cas-lock/5.Lock.md)\n" +
            "- 第二部分：读书笔记\n" +
            "    - 1.代码整洁之道\n" +
            "        - [2.有意义的命名](notes/clean-code/2.%E6%9C%89%E6%84%8F%E4%B9%89%E7%9A%84%E5%91%BD%E5%90%8D.md)\n" +
            "        - [3.函数](notes/clean-code/3.%E5%87%BD%E6%95%B0.md)\n" +
            "        - [4.注释](notes/clean-code/4.%E6%B3%A8%E9%87%8A.md)\n" +
            "        - [5.格式](notes/clean-code/5.%E6%A0%BC%E5%BC%8F.md)\n" +
            "\n" +
            "- 第三部分：经验/备忘\n" +
            "    - [1.安装SSL证书](notes/note/1.安装SSL证书.md)\n" +
            "    - [2.安装filebeat](notes/note/2.安装filebeat.md)\n" +
            "\n" +
            "<!-- /TOC -->";

    @RequestMapping({"/sda", "/indexdsada"})
    public String index(Model model) {
        model.addAttribute("content", toc);
        return "markdown/test";
    }

    @RequestMapping({"/", "/index"})
    public String index313(Model model) {
        model.addAttribute("content", toc);
        return "index";
    }

}
