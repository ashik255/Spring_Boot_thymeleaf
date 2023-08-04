package com.example.Spring_Boot_thymeleaf.controller;

import com.example.Spring_Boot_thymeleaf.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping("/view")
    public ModelAndView view(ModelAndView model){
        model.setViewName("ProductForm.html");
        return model;
    }
    @PostMapping("/formSubmit")
    public ModelAndView formSubmitData (@ModelAttribute Product product, ModelAndView model){
        model.setViewName("CardView.html");
        model.addObject("product",product);
        return model;
    }

}
