package com.project.dao;

import java.util.List;

import com.project.model.LoanDocsVO;

public interface LoanDocsDAO {

	void insertLoanDocs(LoanDocsVO loanDocsVO);
	
	List<LoanDocsVO> searchLoanDocs();
	
	List<LoanDocsVO> SearchByID(LoanDocsVO loanDocsVO);

	List<LoanDocsVO> searchByLoanTypeId(LoanDocsVO loanDocsVO);
	
	List<LoanDocsVO> searchByDocsName(LoanDocsVO loanDocsVO);
}
