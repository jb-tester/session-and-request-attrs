package com.mytests.spring.mvc.sessionAndRequestAttrs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 11/8/2019.
 * Project: session-attrs-and-more
 * *******************************
 */
@Controller
@RequestMapping("/sessionattrs")
public class SAController1 {

    @RequestMapping("/test1")
    public String test1(ModelMap model, @SessionAttribute("globalSessionAttr1") String gsa1,
                        @SessionAttribute("globalSessionAttr2") String gsa2, @RequestAttribute("start") Long ra) {
             model.addAttribute("sa", gsa1+" "+gsa2);
             model.addAttribute("ra", ra);
        return "sa_test1";
    }
    @RequestMapping("/test2")
    public String test2(ModelMap model, @SessionAttribute() String globalSessionAttr3,
                        @SessionAttribute() String globalSessionAttr4, @RequestAttribute() Long start2) {
        model.addAttribute("sa", globalSessionAttr3+" "+globalSessionAttr4);
        model.addAttribute("ra", start2);
        return "sa_test2";
    }
    @RequestMapping("/test3")
    public String test1() {
        return "sa_test3";
    }


}
