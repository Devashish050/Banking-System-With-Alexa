package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.DocsDAO;
import com.project.model.DocsVO;

@Service
@Transactional
public class DocsServiceImpl implements DocsService{

	@Autowired
	DocsDAO docsDAO;
	
	public void insertDocs(DocsVO docsVO)
	{
		this.docsDAO.insertDocs(docsVO);
	}
	public List<DocsVO> searchDocs()
	{
		return this.docsDAO.searchDocs();
	}
	public List<DocsVO> SearchByID(DocsVO docsVO)
	{
		return this.docsDAO.SearchByID(docsVO);
	}


}
