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
import com.project.model.DocsVO;
import com.project.service.DocsService;

@Controller
public class DocsController {

	@Autowired
	DocsService docsService;
	
	@GetMapping(value="admin/loadRequiredDocs")
	public ModelAndView loadDocs()
	{
		return new ModelAndView("admin/addDocs","DocsVO",new DocsVO());
	}
	@PostMapping(value="admin/insertRequiredDocs")
	public ModelAndView insertDocs(@ModelAttribute DocsVO docsVO,@RequestParam int id)
	{
		docsVO.setId(id);
		this.docsService.insertDocs(docsVO);
		return new ModelAndView("redirect:/admin/loadRequiredDocs");	
	}
	@GetMapping(value="admin/searchRequiredDocs")
	public ModelAndView searchDocs()
	{
		List<DocsVO> docsList = this.docsService.searchDocs();
		System.out.println("DocsList()::::"+docsList.size());
		return new ModelAndView("admin/viewDocs","docsList",docsList);
					
	}
	@GetMapping(value="admin/deleteRequiredDocs")
	public ModelAndView deleteDocs(@ModelAttribute DocsVO docsVO,@RequestParam int id)
	{
		docsVO.setId(id);
		List<DocsVO> docsList = this.docsService.SearchByID(docsVO);
		DocsVO docsVO2 = (DocsVO) docsList.get(0);
		docsVO2.setStatus(false);
		this.docsService.insertDocs(docsVO2);
		return new ModelAndView("redirect:/admin/searchRequiredDocs");
	}
	@GetMapping(value="admin/editRequiredDocs")
	public ModelAndView editDocs(@ModelAttribute AccountTypeVO accountTypeVO,@ModelAttribute DocsVO docsVO,@RequestParam int id)
	{
		docsVO.setId(id);
		List<DocsVO> docsList = this.docsService.SearchByID(docsVO);
		return new ModelAndView("admin/addDocs","DocsVO",(DocsVO)docsList.get(0));
	}
}
