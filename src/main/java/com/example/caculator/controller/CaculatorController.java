package com.example.caculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @RequestMapping(value = "/form")
    public String showForm() {
        return "/form";
    }

    @RequestMapping(value = "/result")
    public String showResult(@RequestParam String pheptinh, @RequestParam double first_number, @RequestParam double second_number, Model model) {
        double result = 0;
        if (pheptinh.equals("cong")) {
            result = first_number + second_number;
        }else if (pheptinh.equals("tru")) {
            result = first_number - second_number;
        }else if (pheptinh.equals("nhan")) {
            result = first_number * second_number;
        }else if (pheptinh.equals("chia") && second_number != 0) {
            result = first_number / second_number;
        }
        model.addAttribute("result", result);
        return "/result";
    }
}
