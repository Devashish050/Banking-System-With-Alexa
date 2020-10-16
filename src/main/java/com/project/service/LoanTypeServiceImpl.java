package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LoanTypeDAO;
import com.project.model.LoanTypeVO;
@Service
@Transactional
public class LoanTypeServiceImpl implements LoanTypeService {

	@Autowired
	LoanTypeDAO loanTypeDAO;
	
	public void insertLoanType(LoanTypeVO loanTypeVO)
	{
		this.loanTypeDAO.insertLoanType(loanTypeVO);
	}
	
	public List<LoanTypeVO> searchLoanType()
	{
		return this.loanTypeDAO.searchLoanType();
	}
	public 	List<LoanTypeVO> searchByID(LoanTypeVO loanTypeVO)
	{
		return this.loanTypeDAO.SearchByID(loanTypeVO);
	}

}
