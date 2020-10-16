package com.project.dao;

import java.util.List;

import com.project.model.ManageLoanRateVO;



public interface ManageLoanRateDAO {

	public void insertLoanRate(ManageLoanRateVO manageLoanRateVO);
	
	List<ManageLoanRateVO> searchLoanRate();
	
	List<ManageLoanRateVO> SearchByID(ManageLoanRateVO manageLoanRateVO);

}
