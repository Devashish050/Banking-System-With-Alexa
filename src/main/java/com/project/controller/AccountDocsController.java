package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.AccountDocsVO;
import com.project.model.AccountTypeVO;
import com.project.model.DocsVO;
import com.project.service.AccountDocsService;
import com.project.service.AccountTypeService;
import com.project.service.DocsService;

@Controller
public class AccountDocsController {

	@Autowired
	private AccountTypeService accountTypeService;
	
	@Autowired
	private DocsService docsService;
	
	@Autowired
	private AccountDocsService accountDocsService;
	
	@GetMapping(value="admin/loadAccountDocs")
	public ModelAndView loadDocs()
	{
		List<AccountTypeVO> accountList = this.accountTypeService.searchAccountType();
		List<DocsVO> docsList = this.docsService.searchDocs();
		return new ModelAndView("admin/addAccountDocs","AccountDocsVO",new AccountDocsVO()).addObject("accountList", accountList).addObject("docsList", docsList);
	}
	@PostMapping(value="admin/insertAccountDocs")
	public ModelAndView insertAccountDocs(@ModelAttribute AccountDocsVO accountDocsVO,@RequestParam int id)
	{
		accountDocsVO.setId(id);
		this.accountDocsService.insertAccountDocs(accountDocsVO);
		return new ModelAndView("redirect:/admin/loadAccountDocs");
		
	}
	@GetMapping(value="admin/searchAccountDocs")
	public ModelAndView searchLoanDocs()
	{
		List<AccountDocsVO> accountDocsList = this.accountDocsService.searchAccountDocs();
		//System.out.println("loanRate="+accountDocsList.size());
		return new ModelAndView("admin/viewAccountDocs","accountDocsList",accountDocsList);
	}
	@GetMapping(value="admin/deleteAccountDocs")
	public ModelAndView deleteLoanDocs(@ModelAttribute AccountDocsVO accountDocsVO,@RequestParam int id)
	{
		accountDocsVO.setId(id);
		List<AccountDocsVO> accountDocsList = accountDocsService.SearchByID(accountDocsVO);
		AccountDocsVO accountDocsVO2= (AccountDocsVO) accountDocsList.get(0);
		accountDocsVO2.setStatus(false);
		accountDocsService.insertAccountDocs(accountDocsVO2);
		return new ModelAndView("redirect:/admin/searchAccountDocs");
	}
	@GetMapping(value="admin/editAccountDocs")
	public ModelAndView editLoanDocs(@ModelAttribute AccountDocsVO accountDocsVO,@RequestParam int id)
	{
		accountDocsVO.setId(id);
		List<AccountTypeVO> accountList = this.accountTypeService.searchAccountType();
		List<DocsVO> docsList = this.docsService.searchDocs();
		List<AccountDocsVO> accountDocsList = accountDocsService.SearchByID(accountDocsVO);
		return new ModelAndView("admin/addAccountDocs","AccountDocsVO",(AccountDocsVO)accountDocsList.get(0)).addObject("accountList", accountList).addObject("docsList", docsList);
	}


}
