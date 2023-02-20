package dk.kea.htmldemodat22b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String myWelcome(){
        return "welcome";
    }

    @GetMapping("/picture")
    public String myPicture(){
        return "picture";
    }
    

}
