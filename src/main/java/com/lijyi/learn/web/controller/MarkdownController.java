package com.lijyi.learn.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author liyang
 * @date 2019-08-09
 */
@Controller
@RequestMapping("notes")
public class MarkdownController {

    @RequestMapping({"/note/{path}"})
    public String note(Model model, @PathVariable String path) throws IOException {
        return readMd(model, "docs/note/" + path);
    }

    @RequestMapping({"/cas-lock/{path}"})
    public String casLock(Model model, @PathVariable String path) throws IOException {
        return readMd(model, "docs/cas-lock/" + path);
    }

    @RequestMapping({"/clean-code/{path}"})
    public String cleanCode(Model model, @PathVariable String path) throws IOException {
        return readMd(model, "docs/clean-code/" + path);
    }


    private String readMd(Model model, String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        char[] readBuf = new char[2048];
        StringBuilder sb = new StringBuilder();
        while(fileReader.read(readBuf) != -1){
            sb.append(readBuf);
        }
        model.addAttribute("content", sb.toString());
        return "markdown/test";
    }
}
