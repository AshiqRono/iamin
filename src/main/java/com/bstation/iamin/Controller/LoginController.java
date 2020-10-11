package com.bstation.iamin.Controller;

import com.bstation.iamin.Entity.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping
public class LoginController {
    @RequestMapping("/login")
    public String index(HttpServletRequest request, Model model){
        return "login";
    }
}
