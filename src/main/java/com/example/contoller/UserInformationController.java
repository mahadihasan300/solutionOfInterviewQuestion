package com.example.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.dao.UserInformationDao;
import com.example.entity.UserInformation;


@Controller
public class UserInformationController {
	
	@Autowired
	private UserInformationDao userInformationDao;

	
	@GetMapping("/user/form")
	public String autoPhaseForm(@RequestParam(value = "id", required = false) UserInformation userInformation, Model m) {
		if (userInformation == null) {
			userInformation = new UserInformation();
		}
		m.addAttribute("userInformation", userInformation);
		
		return "user/form";
	}
	
	  @PostMapping("/user/form")
	    public String addUser(@Validated UserInformation UserInformation, Model model) {
		  userInformationDao.save(UserInformation);
	        return "redirect:/user/form";
	    }
	  
	  @GetMapping("/user/list")
	  public String showUserList(Model model) {
	      model.addAttribute("users", userInformationDao.findAll());
	      return "user/list";
	  }
}
