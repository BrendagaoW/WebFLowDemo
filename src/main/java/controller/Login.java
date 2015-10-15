package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/login")
public class Login {

    @RequestMapping(method = RequestMethod.POST)
    public String showLogin(HttpServletRequest request, Model model) {
        String userName = request.getParameter("userName");
        model.addAttribute("userName", userName);
        model.addAttribute("message", "Hello World!");
        return "login";
    }
}
