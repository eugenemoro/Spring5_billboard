package ru.morozov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.morozov.repo.AdRepository;

@Controller
@SessionAttributes
public class MiscController {

	@Autowired
	private AdRepository adRepository;

	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String homePage(Model model) {
		//show all ads on home page
		model.addAttribute("ad", adRepository.findAll());
		return "homePage";
	}


	@RequestMapping(value = {"/contact_us"}, method = RequestMethod.GET)
	public String contactUsPage(Model model) {
		model.addAttribute("address", "Russian Federation");
		model.addAttribute("phone", "...");
		model.addAttribute("email", "...");
		return "contactUsPage";
	}
}
