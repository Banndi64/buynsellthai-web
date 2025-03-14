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
    @RequestMapping("download")
    public String download() {
        return "pages/download";
    }
    @RequestMapping("etda-en")
    public String getEtdaEn() {
        return "pages/etda-certificate/etda-en";
    }
    @RequestMapping("etda-th")
    public String getEtdaTn() {
        return "pages/etda-certificate/etda-th";
    }
    @RequestMapping("tou-en")
    public String getTouEn() {
        return "pages/term-of-use/tou-en";
    }
    @RequestMapping("tou-th")
    public String getTouTh() {
        return "pages/term-of-use/tou-th";
    }
    @RequestMapping("tou-kr")
    public String getTouKr() {
        return "pages/term-of-use/tou-kr";
    }
    @RequestMapping("tac-en")
    public String getTacEn() {
        return "pages/terms-and-conditions/tac-en";
    }
    @RequestMapping("tac-th")
    public String getTacTh() {
        return "pages/terms-and-conditions/tac-th";
    }
    @RequestMapping("tac-kr")
    public String getTacKr() {
        return "pages/terms-and-conditions/tac-kr";
    }
    @RequestMapping("privacy-en")
    public String getPrivacyEn() {
        return "pages/privacy-policy/privacy-en";
    }
    @RequestMapping("privacy-th")
    public String getPrivacyTh() {
        return "pages/privacy-policy/privacy-th";
    }
    @RequestMapping("privacy-kr")
    public String getPrivacyKr() {
        return "pages/privacy-policy/privacy-kr";
    }
    @RequestMapping("top-spots/pexels-cosmetic")
    public String getPexelsCosmetic() {
        return "pages/top-spots-pages/pexels-cosmetic";
    }
    @RequestMapping("top-spots/kaorioxbuynsell")
    public String getKaorioxBuynsell() {
        return "pages/top-spots-pages/kaorioxbns";
    }
}