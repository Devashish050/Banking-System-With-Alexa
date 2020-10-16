package com.project.service;

import java.util.List;

import com.project.model.ManageLoanRateVO;


public interface ManageLoanRateService {

	void insertLoanRate(ManageLoanRateVO manageLoanRateVO);
	
	List<ManageLoanRateVO> searchLoanRate();
	
	List<ManageLoanRateVO> searchByID(ManageLoanRateVO manageLoanRateVO);

}
