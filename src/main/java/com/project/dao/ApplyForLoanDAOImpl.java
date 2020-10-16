package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.ApplyForLoanVO;
import com.project.model.ManageLoanRateVO;

@Repository
public class ApplyForLoanDAOImpl implements ApplyForLoanDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void insertApplyLoan(ApplyForLoanVO applyLoanVO) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(applyLoanVO);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<?> searchApplyLoan(ApplyForLoanVO applyLoanVO) {
		List<?> applyLoanList = new ArrayList();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from ApplyForLoanVO where loginVO.id = " + applyLoanVO.getLoginVO().getId());
			applyLoanList = q.list();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return applyLoanList;

	}

	public List<?> ajaxLoanRateSearch(ManageLoanRateVO manageLoanRateVO) {
		List<?> loanRateList = new ArrayList();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery(
					"from ManageLoanRateVO where loanTypeVO.id=" + manageLoanRateVO.getLoanTypeVO().getId());
			loanRateList = q.list();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return loanRateList;

	}

	public List<?> searchApplyLoanForAdmin() {
		
		List<?> applyLoanList = new ArrayList();
		
		try {
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from ApplyForLoanVO");
			applyLoanList = q.list();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return applyLoanList;

	}
	
	public List<?> findById(ApplyForLoanVO applyLoanVO)
	{
		List<?> applyLoanList = new ArrayList();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from ApplyForLoanVO where id = " + applyLoanVO.getId());
			applyLoanList = q.list();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return applyLoanList;
	}

}
