package com.aetsmtl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class springLearningController {

	@RequestMapping(value = "/quote.html")
	public String getRandomQote(Model model){
		model.addAttribute("Random quote");
		return "Quote";
	}
}
