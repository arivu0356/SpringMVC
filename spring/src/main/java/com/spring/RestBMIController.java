package com.spring;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestBMIController {

	@PostMapping("/bmi")
    public String calculateBMI(@RequestParam("height") double height,
                               @RequestParam("weight") double weight) {
       
        double bmi = calculateBMIValue(height, weight);
        
        return String.valueOf(bmi);
    }

  
    private double calculateBMIValue(double height, double weight) {
        return (weight / (height * height)) * 703; // BMI formula for imperial units
    }
    
}
