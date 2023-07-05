package com.nagarro.userauthentication.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import com.nagarro.userauthentication.dao.LoginandSignUpDao;
import com.nagarro.userauthentication.entity.User;


/**
 * LoginController: To facilitate the login process
 * 
 * @author rajanbirkaur
 *
 */
@Controller
public class LoginandSignUpController {
	
	@Autowired
	LoginandSignUpDao loginDao;
	
	@GetMapping("/login")
    public String showForm() {
        return "login";
	}
	
	@GetMapping("/signup")
    public String showSignUpForm() {
        return "signup";
    }
	
	@PostMapping("/signup")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        loginDao.register(user);
		model.setViewName("login");
		return model;
	}
	
	@PostMapping("/login")
	public ModelAndView authenticate(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (loginDao.validate(username, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			model.setViewName("welcome");
		}else {
		  request.setAttribute("error", "Invalid username or password");
		  model.setViewName("login");
		}
		return model;
	}
}
