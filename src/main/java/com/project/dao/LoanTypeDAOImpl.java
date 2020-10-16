package com.project.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.LoanTypeVO;


@Repository
public class LoanTypeDAOImpl implements LoanTypeDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void insertLoanType(LoanTypeVO loanTypeVO)
	{
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(loanTypeVO);
			}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	
	@SuppressWarnings("unchecked")
	public List<LoanTypeVO> searchLoanType()
	{
		List<LoanTypeVO> loanList = new ArrayList<LoanTypeVO>();
		try{
	 		Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from LoanTypeVO where status = true");
			loanList = q.list();

			}
			catch (Exception e) {
				
				e.printStackTrace();
			}
		return loanList;
	}
	
	@SuppressWarnings("unchecked")
	public 	List<LoanTypeVO> SearchByID(LoanTypeVO loanTypeVO)
	{
		List<LoanTypeVO> loanList = new ArrayList<LoanTypeVO>();
		try{
 		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from LoanTypeVO where status = true and id="+loanTypeVO.getId());
		loanList = (List<LoanTypeVO>) q.list();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return loanList;

		
	}
}
