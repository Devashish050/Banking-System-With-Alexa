package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.AccountTypeDAO;
import com.project.model.AccountTypeVO;

@Service
@Transactional
public class AccountTypeServiceImpl implements AccountTypeService{

	@Autowired
	AccountTypeDAO accountTypeDAO;
	
	public void insertAccountType(AccountTypeVO accountTypeVO)
	{
		this.accountTypeDAO.insertAccountType(accountTypeVO);
	}
	public List<AccountTypeVO> searchAccountType()
	{
		return this.accountTypeDAO.searchAccountType();
	}
	public List<AccountTypeVO> searchByID(AccountTypeVO accountTypeVO)
	{
		return this.accountTypeDAO.searchByID(accountTypeVO);
	}

}
