package edu.iss.caps.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/admin/manage")
@Controller
public class AdminController
{

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String manage(Locale locale, Model model)
	{

		return "manage";
	}
}
