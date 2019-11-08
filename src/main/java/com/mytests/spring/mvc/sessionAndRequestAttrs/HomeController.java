package com.mytests.spring.mvc.sessionAndRequestAttrs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("home", "hello!");
        return "index";
    }
}
