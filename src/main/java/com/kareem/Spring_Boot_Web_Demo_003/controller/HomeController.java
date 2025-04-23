package com.kareem.Spring_Boot_Web_Demo_003.controller;

import com.kareem.Spring_Boot_Web_Demo_003.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showForm(Model model){
        model.addAttribute("student",new Student());
        System.out.println("Show Form");
        return "form";
    }
    @RequestMapping("submitStudent")
    public String submitStudent(@ModelAttribute Student student , Model model){
        model.addAttribute("student", student);
        System.out.println("Show Result");

        return "result";
    }
}
