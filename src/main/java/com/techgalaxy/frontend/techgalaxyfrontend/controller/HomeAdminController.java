package com.techgalaxy.frontend.techgalaxyfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HomeAdminController {
    @GetMapping("/home")
    public String homeAdmin(){
        return "redirect:/homeAdmin.html";
    }
}
