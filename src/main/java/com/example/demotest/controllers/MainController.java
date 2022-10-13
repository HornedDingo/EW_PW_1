package com.example.demotest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/calc")
    public String getСalc(@RequestParam(name = "value1", required = false, defaultValue = "0") double value1,
                       @RequestParam(name = "value2", required = false, defaultValue = "0") double value2,
                       @RequestParam(name = "operation", required = false, defaultValue = "+") String operation, Model model) {

        double result = switch (operation) {
            case "+"-> value1 + value2;
            case "-"-> value1 - value2;
            case "*"-> value1 * value2;
            case "/"-> value1 / value2;
            default-> 0;
        };
        model.addAttribute("result", result);

        return "result";
    }

    @PostMapping("/calc")
    public String postCalc(@RequestParam(name = "value1", required = false, defaultValue = "0") double value1,
                       @RequestParam(name = "value2", required = false, defaultValue = "0") double value2,
                       @RequestParam(name = "operation", required = false, defaultValue = "+") String operation, Model model) {

        double result = switch (operation) {
            case "+"-> value1 + value2;
            case "-"-> value1 - value2;
            case "*"-> value1 * value2;
            case "/"-> value1 / value2;
            default-> 0;
        };
        model.addAttribute("result", result);

        return "result";
    }

}

