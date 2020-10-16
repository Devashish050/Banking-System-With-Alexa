package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.LoanDocsDAO;
import com.project.model.LoanDocsVO; 

@Service
@Transactional
public class LoanDocsServiceImpl implements LoanDocsService {

	@Autowired
	LoanDocsDAO LoanDocsDAO;

	public void insertLoanDocs(LoanDocsVO loanDocsVO) {
		this.LoanDocsDAO.insertLoanDocs(loanDocsVO);
	}

	public List<LoanDocsVO> searchLoanDocs() {
		return this.LoanDocsDAO.searchLoanDocs();
	}

	public List<LoanDocsVO> SearchByID(LoanDocsVO loanDocsVO) {
		return this.LoanDocsDAO.SearchByID(loanDocsVO);
	}

	public List<LoanDocsVO> searchByLoanTypeId(LoanDocsVO loanDocsVO) {
		return this.LoanDocsDAO.searchByLoanTypeId(loanDocsVO);
	}
	
	public List<LoanDocsVO> searchByDocsName(LoanDocsVO loanDocsVO)
	{
		return this.LoanDocsDAO.searchByDocsName(loanDocsVO);
	}

}