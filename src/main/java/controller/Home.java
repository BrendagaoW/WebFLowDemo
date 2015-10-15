package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class Home {

    @RequestMapping(method = RequestMethod.GET)
    public String showLogin(Model model) {
        model.addAttribute("message", "Please log in!");
        return "home";
    }



}
