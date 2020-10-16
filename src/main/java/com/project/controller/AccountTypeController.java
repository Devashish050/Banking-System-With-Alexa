package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.AccountTypeVO;
import com.project.service.AccountTypeService;


@Controller
public class AccountTypeController {

	@Autowired
	AccountTypeService accountTypeService;
	
	@GetMapping(value="admin/loadAccountType")
	public ModelAndView loadLoanType()
	{
		return new ModelAndView("admin/accountType","AccountTypeVO",new AccountTypeVO());
		
	}
	
	@PostMapping(value="admin/insertAccountType")
	public ModelAndView insertLoanType(@ModelAttribute AccountTypeVO accountTypeVO,@RequestParam int id)
	{
		accountTypeVO.setId(id);
		this.accountTypeService.insertAccountType(accountTypeVO);
		return new ModelAndView("redirect:/admin/loadAccountType");
		
	}
	@GetMapping(value="admin/searchAccountType")
	public ModelAndView searchLoanType()
	{
		List<AccountTypeVO> accountList = this.accountTypeService.searchAccountType();
		return new ModelAndView("admin/viewAccountType","accountList",accountList);
	}
	@GetMapping(value="admin/deleteAccountType")
	public ModelAndView deleteLoanType(@ModelAttribute AccountTypeVO accountTypeVO,@RequestParam int id)
	{
		accountTypeVO.setId(id);
		List<AccountTypeVO> accountList = accountTypeService.searchByID(accountTypeVO);
		AccountTypeVO accountTypeVO2 = (AccountTypeVO) accountList.get(0);
		accountTypeVO2.setStatus(false);
		accountTypeService.insertAccountType(accountTypeVO2);
		return new ModelAndView("redirect:/admin/searchAccountType");
	}
	@GetMapping(value="admin/editAccountType")
	public ModelAndView editLoanType(@ModelAttribute AccountTypeVO accountTypeVO,@RequestParam int id)
	{
		accountTypeVO.setId(id);
		List<AccountTypeVO> accountList = accountTypeService.searchByID(accountTypeVO);
		return new ModelAndView("admin/accountType","AccountTypeVO",(AccountTypeVO)accountList.get(0));
	}

}
