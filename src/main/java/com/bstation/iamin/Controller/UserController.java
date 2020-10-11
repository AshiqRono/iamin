package com.bstation.iamin.Controller;

import com.bstation.iamin.Entity.User;
import com.bstation.iamin.Repository.UserRepository;
import com.bstation.iamin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping()
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @GetMapping("/signup")
    public String showSignUpForm(User user) {
        return "add-user";
    }

    @RequestMapping("/adduser")
    public String addUser(User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }
        userService.save(user);
        return "redirect:/";
    }
}
