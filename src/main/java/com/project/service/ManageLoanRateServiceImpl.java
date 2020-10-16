package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ManageLoanRateDAO;
import com.project.model.ManageLoanRateVO;

@Service
@Transactional
public class ManageLoanRateServiceImpl implements ManageLoanRateService {

	@Autowired
	ManageLoanRateDAO manageLoanRateDAO;
	
	public void insertLoanRate(ManageLoanRateVO manageLoanRateVO)
	{
		this.manageLoanRateDAO.insertLoanRate(manageLoanRateVO);
	}
	
	public List<ManageLoanRateVO> searchLoanRate()
	{
		return this.manageLoanRateDAO.searchLoanRate();
	}
	public 	List<ManageLoanRateVO> searchByID(ManageLoanRateVO manageLoanRateVO)
	{
		return this.manageLoanRateDAO.SearchByID(manageLoanRateVO);
	}

}
