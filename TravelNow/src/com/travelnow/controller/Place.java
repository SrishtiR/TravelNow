package com.travelnow.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.travelnow.model.PlaceModel;
import com.travelnow.service.PlaceService;

/**
 * 
 * @author srishti
 *
 */
@Controller
public class Place {
	@Autowired
	private PlaceService placeService;

	public PlaceService getPlaceService() {
		return placeService;
	}

	public void setPlaceService(PlaceService placeService) {
		this.placeService = placeService;
	}
	
	@RequestMapping(value ="/welcome" ,method=RequestMethod.GET)
	public String searchPage(Model model){
		model.addAttribute("PlaceM", new PlaceModel());
		return "search";
	}
	
	@RequestMapping(value ="/placeSearch" ,method=RequestMethod.POST)
	public ModelAndView searchPage(@Valid @ModelAttribute("PlaceM") String place,BindingResult bindingResult){

		ModelAndView modelAndView = new ModelAndView("search");
		PlaceModel placemodel = getPlaceService().displayPlace(place);
		if(placemodel!= null){
			modelAndView.addObject("PlaceM", placemodel);
			return modelAndView;
		}else{
			 modelAndView = new ModelAndView("notFound");
		}
		return modelAndView;
	}

}
