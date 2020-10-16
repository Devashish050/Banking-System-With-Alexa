package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.AccountDocsDAO;
import com.project.model.AccountDocsVO;

@Service
@Transactional
public class AccountDocsServiceImpl implements AccountDocsService{

	@Autowired
	AccountDocsDAO accountDocsDAO;
	
	public void insertAccountDocs(AccountDocsVO accountDocsVO)
	{
		this.accountDocsDAO.insertAccountDocs(accountDocsVO);
	}
	public 	List<AccountDocsVO> searchAccountDocs()
	{
		return this.accountDocsDAO.searchAccountDocs();
	}
	public List<AccountDocsVO> SearchByID(AccountDocsVO accountDocsVO)
	{
		return this.accountDocsDAO.SearchByID(accountDocsVO);
	}
}
