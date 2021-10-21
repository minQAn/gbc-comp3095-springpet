package ca.gbc.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    // localhost:8080/index.html, / ,
    @RequestMapping({"", "/", "/index.html"})
    public String index(){
        return "index";
    }

}
