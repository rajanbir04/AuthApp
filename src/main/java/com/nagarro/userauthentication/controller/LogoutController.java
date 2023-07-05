package com.nagarro.userauthentication.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * LogoutController: To facilitate the logout process
 * 
 * @author rajanbirkaur
 *
 */
@Controller
public class LogoutController {
	
	@PostMapping("/logout")
	public ModelAndView logoutUser(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView();
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		session.invalidate();
		model.setViewName("login");
		return model;
	}
}