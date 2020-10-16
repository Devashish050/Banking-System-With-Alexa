package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.ApplyForLoanDAO;
import com.project.model.ApplyForLoanVO;
import com.project.model.ManageLoanRateVO;

@Service
@Transactional
public class ApplyForLoanServiceImpl implements ApplyForLoanService {

	@Autowired
	private ApplyForLoanDAO applyForLoanDAO;

	public void insertApplyLoan(ApplyForLoanVO applyLoanVO) {
		this.applyForLoanDAO.insertApplyLoan(applyLoanVO);

	}

	public List<?> searchApplyLoan(ApplyForLoanVO applyLoanVO) {

		List<?> applyForLoanList = this.applyForLoanDAO.searchApplyLoan(applyLoanVO);
		return applyForLoanList;
	}
	public List<?> ajaxLoanRateSearch(ManageLoanRateVO manageLoanRateVO)
	{
		List<?> loanRateList = this.applyForLoanDAO.ajaxLoanRateSearch(manageLoanRateVO);
		return loanRateList;
	}

	public List<?> searchApplyLoanForAdmin()
	{
		return this.applyForLoanDAO.searchApplyLoanForAdmin();
	}
	
	public List<?> findById(ApplyForLoanVO applyLoanVO)
	{
		return this.applyForLoanDAO.findById(applyLoanVO);
	}

}
