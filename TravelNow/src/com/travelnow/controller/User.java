package com.travelnow.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.travelnow.model.UserModel;
import com.travelnow.model.UserCredential;
import com.travelnow.service.UserService;

@Controller
public class User {
	
	@Autowired
	private UserService UserService;

	public void setUserService(UserService UserService) {
		this.UserService = UserService;
	}
	
	public UserService getUserService() {
		return UserService;
	}
	
	@RequestMapping(value ="/" ,method=RequestMethod.GET)
	public String homePage(){
		return "home";
	}
	@RequestMapping(value ="/login" ,method=RequestMethod.GET)
	public String loginPage(Model model){
		model.addAttribute("UserCredential", new UserCredential());
		return "login";
	}

	@RequestMapping(value ="/register" ,method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute("UserM", new UserModel());
		return "register";
	}

	@RequestMapping(value ="/registerSuccess" ,method=RequestMethod.POST)
	public ModelAndView registerSuccess(@Valid @ModelAttribute("UserM") UserModel UserM,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return new ModelAndView("register");
		}
		getUserService().registerUser(UserM);
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("UserM", UserM);
		return modelAndView;
	}
	@RequestMapping(value ="/loginSuccess" ,method=RequestMethod.POST)
	public ModelAndView loginSuccess(@Valid @ModelAttribute("UserCredential") UserCredential UserCredential,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return new ModelAndView("login");
		}
		
		ModelAndView modelAndView = new ModelAndView("welcome");
		UserModel UserM = getUserService().validateUserCredential(UserCredential.getEmail(), UserCredential.getPassword());
		if(UserM!= null){
			modelAndView.addObject("UserM", UserM);
			return modelAndView;
		}else{
			 modelAndView = new ModelAndView("notFound");
		}
		return modelAndView;
	}
	
	@ModelAttribute
	public void headerMessage(Model model){
		model.addAttribute("headerMessage", "Welcome to TravelNow");
		
		List<String> citesList = new ArrayList<>();
		citesList.add("Boulder");
		citesList.add("LA");
		citesList.add("Delhi");
		citesList.add("Whatever");
		
		//model.addAttribute("placeInterest", placeList);
		model.addAttribute("citesList", citesList);
	}
}
