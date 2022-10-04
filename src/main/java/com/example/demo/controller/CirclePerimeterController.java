package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.CirclePerimeter;

@Controller
public class CirclePerimeterController {
	@GetMapping("/circlePerimeter")
	public String Shapes(Model model) {
	 model.addAttribute("CirclePerimeter", new CirclePerimeter());
	 return "circlePerimeter";
	}
	@PostMapping("/circlePerimeter")
	public String addForm(@ModelAttribute CirclePerimeter circlePerimeter,
			BindingResult result, Model model) {
		model.addAttribute("circlePerimeter", circlePerimeter);
		return "calculateCirclePerimeter";
	  }
	}
