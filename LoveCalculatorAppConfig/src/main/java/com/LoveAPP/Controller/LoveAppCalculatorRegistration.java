package com.LoveAPP.Controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.LoveCalculatorApp.API.RegistrationInfoDTO;

import jakarta.validation.Valid;

@Controller
public class LoveAppCalculatorRegistration {
	
	/*
	 * @RequestMapping("/register") public String
	 * register(@ModelAttribute("userRegistrationInfo") RegistrationInfoDTO
	 * dto,Model model)
	 * 
	 * { model.addAttribute("hobbyOptions", Arrays.asList("reading", "gardening",
	 * "traveling", "sports")); model.addAttribute("genderOptions",
	 * Arrays.asList("male", "female"));
	 * 
	 * return "register-here";}
	 * 
	 * 
	 * @PostMapping("/process-registration") public String
	 * processRegistration(@ModelAttribute("userRegistrationInfo")
	 * RegistrationInfoDTO registrationInfo) { // Your processing logic here return
	 * "registration-success"; // Return the name of the success view }
	 */
	@RequestMapping("/register")
	public String register(@ModelAttribute("userRegistrationInfo") RegistrationInfoDTO dto, Model model) {
		model.addAttribute("hobbyOptions", Arrays.asList("reading", "gardening", "traveling", "sports"));
		model.addAttribute("genderOptions", Arrays.asList("male", "female"));
		return "register-here";
	}
	
	@PostMapping("/process-registration")
    public String processRegistration(@ModelAttribute("userRegistrationInfo") RegistrationInfoDTO registrationInfo) {
        
		
		// Your processing logic here
        return "registration-success"; // Return the name of the success view
	} 
}

/*
 * @RequestMapping(value="/registrationSuccess",method = { RequestMethod.GET,
 * RequestMethod.POST}) public String
 * registrationResult(@ModelAttribute("userRegistrationInfo")
 * RegistrationInfoDTO dto,Model model) {
 * 
 * model.addAttribute("userRegistrationInfo", dto); return
 * "process-registration";} 
 */
