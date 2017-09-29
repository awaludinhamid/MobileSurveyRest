package com.safasoft.mobilesurvey.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * Purpose for testing only
 */
@Controller
public class BaseController {

	@RequestMapping(value={"/","/welcome"}, method=RequestMethod.GET)
	public String getWelcome(ModelMap model) {
		model.addAttribute("message", "Awal");
		return "index";
	}
}
