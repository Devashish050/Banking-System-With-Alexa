package com.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.LoanTypeVO;
import com.project.service.LoanTypeService;

@Controller
public class LoanTypeController {

	@Autowired
	LoanTypeService loanTypeService;

	@GetMapping(value = "admin/loadLoanType")
	public ModelAndView loadLoanType() {
		return new ModelAndView("admin/addLoanType", "LoanTypeVO", new LoanTypeVO());

	}

	@PostMapping(value = "admin/insertLoanType")
	public ModelAndView insertLoanType(@ModelAttribute LoanTypeVO loanTypeVO, @RequestParam int id) {
		loanTypeVO.setId(id);
		this.loanTypeService.insertLoanType(loanTypeVO);
		return new ModelAndView("redirect:/admin/loadLoanType");

	}

	@GetMapping(value = "admin/searchLoanType")
	public ModelAndView searchLoanType() {
		List<LoanTypeVO> loanList = this.loanTypeService.searchLoanType();
		return new ModelAndView("admin/viewLoanType", "loanList", loanList);
	}

	@GetMapping(value = "admin/deleteLoanType")
	public ModelAndView deleteLoanType(@ModelAttribute LoanTypeVO loanTypeVO, @RequestParam int id) {
		loanTypeVO.setId(id);
		List<LoanTypeVO> loanList = loanTypeService.searchByID(loanTypeVO);
		LoanTypeVO loanTypeVO2 = (LoanTypeVO) loanList.get(0);
		loanTypeVO2.setStatus(false);
		loanTypeService.insertLoanType(loanTypeVO2);
		return new ModelAndView("redirect:/admin/searchLoanType");
	}

	@GetMapping(value = "admin/editLoanType")
	public ModelAndView editLoanType(@ModelAttribute LoanTypeVO loanTypeVO, @RequestParam int id) {
		loanTypeVO.setId(id);
		List<LoanTypeVO> loanList = loanTypeService.searchByID(loanTypeVO);
		return new ModelAndView("admin/addLoanType", "LoanTypeVO", (LoanTypeVO) loanList.get(0));
	}
}
