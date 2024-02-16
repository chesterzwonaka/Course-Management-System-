package com.LoveAPP.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.LoveCalculatorApp.API.UserInfoDTO;

import jakarta.validation.Valid;


@Controller
public class LoveAppController {
	
	
	@RequestMapping("/")
	public String showHomepage(@ModelAttribute("userInfo") UserInfoDTO userInfodto)
	
	{return "home-page";}
	

	@RequestMapping(value = "/process-homepage", method = { RequestMethod.GET, RequestMethod.POST })
	public String showResultpage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,BindingResult bindingResult)
	
	{ 
		if(bindingResult.hasErrors())
		{
			System.out.println("form has errors");
			return "home-page";
		}
		
		
		return "result-page";
		
	
	} 



}
