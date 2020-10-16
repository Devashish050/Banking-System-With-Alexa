package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.ManageLoanRateVO;


@Repository
public class ManageLoanRateDAOImpl implements ManageLoanRateDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void insertLoanRate(ManageLoanRateVO manageLoanRateVO)
	{
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(manageLoanRateVO);
			}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	
	@SuppressWarnings("unchecked")
	public List<ManageLoanRateVO> searchLoanRate()
	{
		List<ManageLoanRateVO> loanRateList = new ArrayList<ManageLoanRateVO>();
		try{
	 		Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from ManageLoanRateVO where status = true");
			loanRateList = q.list();

			}
			catch (Exception e) {
				
				e.printStackTrace();
			}
		return loanRateList;
	}
	
	@SuppressWarnings("unchecked")
	public 	List<ManageLoanRateVO> SearchByID(ManageLoanRateVO manageLoanRateVO)
	{
		List<ManageLoanRateVO> loanRateList = new ArrayList<ManageLoanRateVO>();
		try{
 		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from ManageLoanRateVO where status = true and id="+manageLoanRateVO.getId());
		loanRateList = (List<ManageLoanRateVO>) q.list();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return loanRateList;		
	}

}
