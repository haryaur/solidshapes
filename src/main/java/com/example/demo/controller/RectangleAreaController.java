package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.Rectanglearea;

@Controller
public class RectangleAreaController {
@GetMapping("/recArea")
public String Shapes(Model model) {
 model.addAttribute("Rectanglearea", new Rectanglearea());
 return "recArea";
}
@PostMapping("/rectanglearea")
public String addForm(@ModelAttribute Rectanglearea rectanglearea,
		BindingResult result, Model model) {
	model.addAttribute("rectanglearea", rectanglearea);
	return "calculateRectangleArea";
  }
}
