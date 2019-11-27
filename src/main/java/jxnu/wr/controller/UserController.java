package jxnu.wr.controller;


import jxnu.wr.model.User;
import jxnu.wr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")

//这里用了@SessionAttributes，可以直接把model中的user(也就key)放入其中
//这样保证了session中存在user这个对象
@SessionAttributes("user")
public class UserController {
    private UserService userService;
    @RequestMapping(value="/login")
    public String loginPage(@ModelAttribute User user, Model model){
        return "login";
    }
    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(@ModelAttribute User user, Model model, HttpSession session){
        User u=userService.login(user);
        if(u!=null){
            u.setPassword("");
            session.setAttribute("user", u);
            model.addAttribute("status",0);
            model.addAttribute("user",user);
        }else{
            model.addAttribute("status",1);
        }
        return "login";
    }

}