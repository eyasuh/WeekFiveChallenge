package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {




	@GetMapping("/formPage")
	public String loadForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "formPage";
	}

	@PostMapping("/formPage")
	public String processForm(@Valid Customer customer, BindingResult result) {
		if (result.hasErrors())
			return "formPage";
		else
			return "confirmPage";
	}
}
