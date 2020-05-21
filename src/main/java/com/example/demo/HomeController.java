package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeController {

	ArrayList<Cat> catArray = new ArrayList<>();
	ArrayList<Customer> classArr = new ArrayList<>();

 	Customer cust = new Customer();


	@GetMapping("/formPage")
	public String loadForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "formPage";
	}

	@PostMapping("/choice")
	public String petChoice(@RequestParam("answer") boolean answer){
		if (answer)
			return "redirect:/catPage";
		else
			return "redirect:/dogPage";
	}



//	@PostMapping("/formPage")
//	public String processForm(@Valid @ModelAttribute Customer customer, BindingResult result, Model model) {
//		if (result.hasErrors())
//			return "formPage";
//
//		model.addAttribute("customer", customer);
//		customerArray.add(customer);
//		return "confirmPage";
//
//
//	}


	@GetMapping("/catPage")
	public String catForm(Model model) {
		model.addAttribute("customer", new Customer());
		//model.addAttribute("classArr",classArr);
		return "catPage";
	}

	@PostMapping("/catBreedChoice")
	public String petChoice(@RequestParam("breed") String breed){
		cust.setPetInfo(breed);
		return "";
	}



	@PostMapping("/catPage")
	public String processCatForm(@Valid @ModelAttribute Customer customer, BindingResult result, Model model) {
		if (result.hasErrors())
			return "catPage";
			model.addAttribute("customer", customer);
			Customer.customerArray.add(customer);
			return "confirmPage";


	}


	@GetMapping("/dogPage")
	public String dogForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "dogPage";
	}



	@PostMapping("/dogPage")
	public String processDogForm(@Valid @ModelAttribute Customer customer, BindingResult result, Model model) {
		if (result.hasErrors())
			return "dogPage";

		model.addAttribute("customer", customer);
		classArr.add(customer);
		return "confirmPage";


	}

}
