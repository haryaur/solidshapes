package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.CircleArea;

@Controller
public class CircleAreaController {
	@GetMapping("/circleArea")
	public String Shapes(Model model) {
	 model.addAttribute("CircleArea", new CircleArea());
	 return "circleArea";
	}
	@PostMapping("/circleArea")
	public String addForm(@ModelAttribute CircleArea circleArea,
			BindingResult result, Model model) {
		model.addAttribute("circleArea", circleArea);
		return "calculateCircleArea";
	  }
	}