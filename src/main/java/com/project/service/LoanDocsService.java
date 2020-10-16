package com.project.service;

import java.util.List;

import com.project.model.LoanDocsVO;

public interface LoanDocsService {

	void insertLoanDocs(LoanDocsVO loanDocsVO);
	
	List<LoanDocsVO> searchLoanDocs();
	
	List<LoanDocsVO> SearchByID(LoanDocsVO loanDocsVO);
	
	List<LoanDocsVO> searchByLoanTypeId(LoanDocsVO loanDocsVO);
	
	List<LoanDocsVO> searchByDocsName(LoanDocsVO loanDocsVO);


}
