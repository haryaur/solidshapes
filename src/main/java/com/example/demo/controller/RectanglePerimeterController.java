package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.Rectangleperimeter;

@Controller
public class RectanglePerimeterController {
@GetMapping("/recPerimeter")
public String Shapes(Model model) {
 model.addAttribute("Rectangleperimeter", new Rectangleperimeter());
 return "recPerimeter";
}
@PostMapping("/rectangleperimeter")
public String addForm(@ModelAttribute Rectangleperimeter rectangleperimeter,
		BindingResult result, Model model) {
	model.addAttribute("rectangleperimeter", rectangleperimeter);
	return "calculateRectangleperimeter";
  }
}
