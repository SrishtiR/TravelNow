//package com.travelnow.controller;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.travelnow.model.PlaceInterestModel;
//import com.travelnow.model.PlaceModel;
//import com.travelnow.model.UserModel;
//import com.travelnow.service.PlaceInterestService;
//import com.travelnow.user_impl.MarkPlaceInterestService;
//
//@Controller
//public class PlaceInterest {
//	@Autowired
//	private PlaceInterestService placeInterestService;
//
//	public PlaceInterestService getPlaceInterestService() {
//		return placeInterestService;
//	}
//
//	public void setPlaceService(PlaceInterestService placeInterestService) {
//		this.placeInterestService = placeInterestService;
//	}
//	@RequestMapping(value ="/search" ,method=RequestMethod.GET)
//	public String place(Model model){
//		model.addAttribute("PlaceIM", new PlaceInterestModel());
//		return "place";
//	}
//	
//	@RequestMapping(value ="/placeInterested" ,method=RequestMethod.POST)
//	public ModelAndView placeSuccess(@Valid @ModelAttribute("PlaceIM") PlaceInterestModel PlaceIM,BindingResult bindingResult){
//		if(bindingResult.hasErrors()){
//			return new ModelAndView("placeInterested");
//		}
//		getPlaceInterestService().markPlaceInterested(PlaceIM);
//		ModelAndView modelAndView = new ModelAndView("placeInterested");
//		modelAndView.addObject("PlaceIM", PlaceIM);
//		return modelAndView;
//	}
//
//}