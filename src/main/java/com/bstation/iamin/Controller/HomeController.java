package com.bstation.iamin.Controller;

import com.bstation.iamin.Entity.Post;
import com.bstation.iamin.Entity.User;
import com.bstation.iamin.Repository.PostRepository;
import com.bstation.iamin.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping()
public class HomeController {
    @Autowired
    PostRepository postRepository;

    @RequestMapping("/")
    public String index(HttpServletRequest request, Model model){
        List<Post> posts = postRepository.findAllByForPublic(true);
        model.addAttribute("posts", posts);
        return "index";
    }
}
