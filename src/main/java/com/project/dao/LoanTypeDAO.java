package com.project.dao;

import java.util.List;

import com.project.model.LoanTypeVO;

public interface LoanTypeDAO {

	public void insertLoanType(LoanTypeVO loanTypeVO);
	
	List<LoanTypeVO> searchLoanType();
	
	List<LoanTypeVO> SearchByID(LoanTypeVO loanTypeVO);

}
