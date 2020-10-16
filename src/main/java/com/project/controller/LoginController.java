package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.ComplainVO;
import com.project.model.FeedbackVO;
import com.project.model.LoginVO;
import com.project.service.ComplainService;
import com.project.service.FeedbackService;
import com.project.service.GraphService;
import com.project.service.LoginService;


@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@Autowired
	ComplainService  complainService;
	
	@Autowired	
	FeedbackService feedbackService;
	
	@Autowired
	GraphService graphService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView loadLogin() {

		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/admin/index", method = RequestMethod.GET)
	public ModelAndView adminIndex(@ModelAttribute LoginVO loginVO,ComplainVO complainVO,
			FeedbackVO feedbackVO,Model model) {

		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = user.getUsername();
		model.addAttribute("userName", userName);
		
		List<ComplainVO> totalComplainList = this.complainService.adminViewComplain();
		List<ComplainVO> pendingComplaintList = this.complainService.viewPendingComplain(complainVO);
		List<ComplainVO> resolvedComplainList = this.complainService.viewResolveComplain(complainVO);
		List<FeedbackVO> feedbackList = this.feedbackService.viewFeedback(feedbackVO);
		List<?> loanList = this.graphService.viewLoanGraph();
		List<?> loanList1 = this.graphService.maximumLoanCount();
		
		model.addAttribute("totalComplainList", totalComplainList.size());
		model.addAttribute("pendingComplaintList",pendingComplaintList.size());
		model.addAttribute("resolvedComplainList",resolvedComplainList.size());
		model.addAttribute("feedbackList",feedbackList.size());
		model.addAttribute("loanList",loanList);
		model.addAttribute("loanList1", loanList1);
		return new ModelAndView("admin/index","data",model);
	}	
	
	@RequestMapping(value = "/user/index", method = RequestMethod.GET)
	public ModelAndView userIndex() {

		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = user.getUsername();
	
		return new ModelAndView("user/index");
	}
	
	@RequestMapping(value = "/logout", method = {RequestMethod.POST, RequestMethod.GET})	
	public String viewUserDetails(ModelMap model,HttpServletResponse response,HttpServletRequest request) {

		  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        if (auth != null) {
	            new SecurityContextLogoutHandler().logout(request, response, auth);
	            request.getSession().invalidate();
	            request.getSession().setAttribute("tempStatus", "success");
	            request.getSession().setAttribute("statusText", "Logout Successfully!");
	        }
	        return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView load() {

		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView load403() {

		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ModelAndView error() {

		return new ModelAndView("login");
	}
	
}