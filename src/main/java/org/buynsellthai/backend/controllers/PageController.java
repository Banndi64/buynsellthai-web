package org.buynsellthai.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {  
    
    @RequestMapping("/")
    public String index() {
        return "pages/index";
    }
    @RequestMapping("top-spots")
    public String topSpots() {
        return "pages/top-spots";
    }
    @RequestMapping("event")
    public String event() {
        return "pages/event";
    }
    @RequestMapping("services")
    public String services() {
        return "pages/services";
    }
    @RequestMapping("membership")
    public String memberShip() {
        return "pages/membership";
    }
    @RequestMapping("blog")
    public String blog() {
        return "pages/blog";
    }
    @RequestMapping("about-us")
    public String aboutUs() {
        return "pages/about-us";
    }
    @RequestMapping("legal")
    public String legal() {
        return "pages/legal";
    }
    @RequestMapping("support")
    public String support() {
        return "pages/support";
    }
    @RequestMapping("etda-en")
    public String getEtdaEn() {
        return "pages/etda-certificate/etda-en";
    }
    @RequestMapping("etda-th")
    public String getEtdaTn() {
        return "pages/etda-certificate/etda-th";
    }
}