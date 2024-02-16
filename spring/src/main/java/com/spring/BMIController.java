package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BMIController {
	
    @RequestMapping(value = "/bmii", method = RequestMethod.POST)
    public String user(@Validated BMIController bmii, Model model) {
        System.out.println("User Page Requested");
      
        return "bmii";
      
    }

    @PostMapping("/bmi")
    public String calculateBMI(@RequestParam("height") double heightInInches, 
                               @RequestParam("weight") double weightInPounds,
                               Model model) {
        double bmi = (weightInPounds / (heightInInches * heightInInches)) * 703;
        model.addAttribute("bmi", bmi);
        return "bmi";
    }
}