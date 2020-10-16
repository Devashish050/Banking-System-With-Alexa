package com.project.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.LoanDocsVO;
import com.project.model.LoanTypeVO;
import com.project.model.DocsVO;
import com.project.service.LoanDocsService;
import com.project.service.LoanTypeService;
import com.project.service.DocsService;

@Controller
public class LoanDocsController {

	@Autowired
	LoanTypeService loanTypeService;
	
	@Autowired
	LoanDocsService loanDocsService;
	
	@Autowired
	DocsService docsService;
	
	@GetMapping(value="admin/loadLoanDocs")
	public ModelAndView loadDocs()
	{
		List<LoanTypeVO> loanList = this.loanTypeService.searchLoanType();
		List<DocsVO> docsList = this.docsService.searchDocs();
		return new ModelAndView("admin/addLoanDocs","LoanDocsVO",new LoanDocsVO()).addObject("loanList", loanList).addObject("docsList", docsList);
	}
	@PostMapping(value="admin/insertLoanDocs")
	public ModelAndView insertLoanDocs(@ModelAttribute LoanDocsVO loanDocsVO,@RequestParam int id)
	{
		loanDocsVO.setId(id);
		this.loanDocsService.insertLoanDocs(loanDocsVO);
		return new ModelAndView("redirect:/admin/loadLoanDocs");
		
	}
	@GetMapping(value="admin/searchLoanDocs")
	public ModelAndView searchLoanDocs()
	{
		List<LoanDocsVO> loanDocsList = this.loanDocsService.searchLoanDocs();
		System.out.println("loanRate="+loanDocsList.size());
		return new ModelAndView("admin/viewLoanDocs","loanDocsList",loanDocsList);
	}
	@GetMapping(value="admin/deleteLoanDocs")
	public ModelAndView deleteLoanDocs(@ModelAttribute LoanDocsVO loanDocsVO,@RequestParam int id)
	{
		loanDocsVO.setId(id);
		List<LoanDocsVO> loanDocsList = loanDocsService.SearchByID(loanDocsVO);
		LoanDocsVO loanDocsVO2= (LoanDocsVO) loanDocsList.get(0);
		loanDocsVO2.setStatus(false);
		loanDocsService.insertLoanDocs(loanDocsVO2);
		return new ModelAndView("redirect:/admin/searchLoanDocs");
	}
	@GetMapping(value="admin/editLoanDocs")
	public ModelAndView editLoanDocs(@ModelAttribute LoanTypeVO loanTypeVO,@ModelAttribute LoanDocsVO loanDocsVO,@RequestParam int id)
	{
		loanDocsVO.setId(id);
		List<LoanTypeVO> loanList = loanTypeService.searchLoanType();
		List<DocsVO> docsList = this.docsService.searchDocs();
		List<LoanDocsVO> loanDocsList = loanDocsService.SearchByID(loanDocsVO);
		return new ModelAndView("admin/addLoanDocs","LoanDocsVO",(LoanDocsVO)loanDocsList.get(0)).addObject("loanList", loanList).addObject("docsList", docsList);
	}

	
}
