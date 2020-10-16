package com.project.service;

import java.util.List;

import com.project.model.ApplyForLoanVO;
import com.project.model.ManageLoanRateVO;

public interface ApplyForLoanService {

	public void insertApplyLoan(ApplyForLoanVO applyLoanVO);
	
	public List<?> searchApplyLoan(ApplyForLoanVO applyLoanVO);

	public List<?> ajaxLoanRateSearch(ManageLoanRateVO manageLoanRateVO);
	
	public List<?> searchApplyLoanForAdmin();
	
	public List<?> findById(ApplyForLoanVO applyLoanVO);

}
