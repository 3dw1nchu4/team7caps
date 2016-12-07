package edu.iss.caps.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.iss.caps.model.Course;
import edu.iss.caps.model.LecturerDetail;
import edu.iss.caps.model.User;
import edu.iss.caps.service.CourseService;
import edu.iss.caps.service.LecturerService;
import edu.iss.caps.service.UserService;

@RequestMapping("/admin")
@Controller
public class AdminController
{
	@Autowired
	CourseService cseService;
	@Autowired
	LecturerService lecturerService;

	@RequestMapping(value = "/manage", params = "manage=student", method = RequestMethod.GET)
	public ModelAndView manage(Locale locale, Model model)
	{
		ModelAndView mav = new ModelAndView("managestudent");
		List<Course> cseList = cseService.findAllCourses();
		mav.addObject("dataList", cseList);
		return mav;
	}

	@RequestMapping(value = "/manage", params = "manage=lecturer", method = RequestMethod.GET)
	public ModelAndView manage2(Locale locale, Model model, @RequestParam Map<String, String> requestParams)
	{
		try
		{
			String id = requestParams.get("id");
			ModelAndView mav = new ModelAndView("managelecturer");
			LecturerDetail lecturer = lecturerService.findLecturerById(id);
			mav.addObject("data", lecturer);
			return mav;
		} catch (Exception e)
		{
			ModelAndView mav = new ModelAndView("managelecturer");
			List<LecturerDetail> lctList = lecturerService.findAllLecturers();
			mav.addObject("dataList", lctList);
			return mav;
		}
	}

	@RequestMapping(value = "/manage", params = "manage=course", method = RequestMethod.GET)
	public ModelAndView manage3(Locale locale, Model model)
	{
		ModelAndView mav = new ModelAndView("managecourse");
		List<Course> cseList = cseService.findAllCourses();
		mav.addObject("dataList", cseList);
		return mav;
	}

	@RequestMapping(value = "/manage", params = "manage=enrolment", method = RequestMethod.GET)
	public ModelAndView manage4(Locale locale, Model model)
	{
		ModelAndView mav = new ModelAndView("manageenrolment");
		List<Course> cseList = cseService.findAllCourses();
		mav.addObject("dataList", cseList);
		return mav;
	}
}
