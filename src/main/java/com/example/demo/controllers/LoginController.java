package com.example.demo.controllers;

import com.example.demo.dto.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("login")
    public String getLoginForm()
    {
        return "login";
    }

    @PostMapping("login")
    public String login(LoginRequest req, Model model) {
//        req.getParameter() -> String -> parseInt()
        System.out.println("Đã vào hàm login()");
        System.out.println(req.getUsername() + "-" + req.getPassword());
        model.addAttribute("name", req.getUsername());
        return "n";
    }
}
