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
import com.project.model.ManageLoanRateVO;
import com.project.service.LoanTypeService;
import com.project.service.ManageLoanRateService;

@Controller
public class ManageLoanRateController {

	@Autowired
	ManageLoanRateService manageLoanRateService;
	@Autowired
	LoanTypeService loanTypeService;
	
	
	@GetMapping(value="admin/loadLoanRate")
	public ModelAndView loadLoanRate()
	{
		List<LoanTypeVO> loanList = this.loanTypeService.searchLoanType();
		return new ModelAndView("admin/manageLoanRate","ManageLoanRateVO",new ManageLoanRateVO()).addObject("loanList", loanList);
	}
	@PostMapping(value="admin/insertLoanRate")
	public ModelAndView insertLoanRate(@ModelAttribute ManageLoanRateVO manageLoanRateVO,@RequestParam int id)
	{
		manageLoanRateVO.setId(id);
		this.manageLoanRateService.insertLoanRate(manageLoanRateVO);
		return new ModelAndView("redirect:/admin/loadLoanRate");
	}
	@GetMapping(value="admin/searchLoanRate")
	public ModelAndView searchLoanType()
	{
		List<ManageLoanRateVO> loanRateList = this.manageLoanRateService.searchLoanRate();
		
		System.out.println("loanRate="+loanRateList.size());
		return new ModelAndView("admin/viewLoanRate","loanRateList",loanRateList);
	}
	@GetMapping(value="admin/deleteLoanRate")
	public ModelAndView deleteLoanType(@ModelAttribute ManageLoanRateVO manageLoanRateVO ,@RequestParam int id)
	{
		manageLoanRateVO.setId(id);
		List<ManageLoanRateVO> loanRateList = manageLoanRateService.searchByID(manageLoanRateVO);
		ManageLoanRateVO manageLoanRateVO2= (ManageLoanRateVO) loanRateList.get(0);
		manageLoanRateVO2.setStatus(false);
		manageLoanRateService.insertLoanRate(manageLoanRateVO2);
		return new ModelAndView("redirect:/admin/searchLoanRate");
	}
	@GetMapping(value="admin/editLoanRate")
	public ModelAndView editLoanType(@ModelAttribute LoanTypeVO loanTypeVO,@ModelAttribute ManageLoanRateVO manageLoanRateVO,@RequestParam int id)
	{
		List<LoanTypeVO> loanList = loanTypeService.searchLoanType();
		manageLoanRateVO.setId(id);
		List<ManageLoanRateVO> loanRateList = manageLoanRateService.searchByID(manageLoanRateVO);
		return new ModelAndView("admin/manageLoanRate","ManageLoanRateVO",(ManageLoanRateVO)loanRateList.get(0)).addObject("loanList", loanList);
	}
}
