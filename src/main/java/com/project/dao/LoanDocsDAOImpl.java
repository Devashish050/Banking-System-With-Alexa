package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.LoanDocsVO;


@Repository
public class LoanDocsDAOImpl implements LoanDocsDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void insertLoanDocs(LoanDocsVO loanDocsVO)
	{
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(loanDocsVO);
			}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	@SuppressWarnings("unchecked")
	public List<LoanDocsVO> searchLoanDocs()
	{
		List<LoanDocsVO> loanRequiredDocsList = new ArrayList<LoanDocsVO>();
		try{
	 		Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from LoanDocsVO where status = true");
			loanRequiredDocsList = q.list();

			}
			catch (Exception e) {
				
				e.printStackTrace();
			}
		return loanRequiredDocsList;
	}
	
	@SuppressWarnings("unchecked")
	public List<LoanDocsVO> SearchByID(LoanDocsVO loanDocsVO)
	{
		List<LoanDocsVO> loanRequiredDocsList = new ArrayList<LoanDocsVO>();
		try{
 		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from LoanDocsVO where status = true and id="+loanDocsVO.getId());
		loanRequiredDocsList = (List<LoanDocsVO>) q.list();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return loanRequiredDocsList;

		
	}
	
	@SuppressWarnings("unchecked")
	public List<LoanDocsVO> searchByLoanTypeId(LoanDocsVO loanDocsVO)
	{
		List<LoanDocsVO> loanRequiredDocsList = new ArrayList<LoanDocsVO>();
		try{
 		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from LoanDocsVO where status = true and loanTypeVO.id="+loanDocsVO.getLoanTypeVO().getId());
		loanRequiredDocsList = (List<LoanDocsVO>) q.list();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return loanRequiredDocsList;
	}

	@SuppressWarnings("unchecked")
	public List<LoanDocsVO> searchByDocsName(LoanDocsVO loanDocsVO)
	{
		List<LoanDocsVO> loanDocsList = new ArrayList<LoanDocsVO>();
		try{
 		Session session = sessionFactory.getCurrentSession();
		/*Query q = session.createSQLQuery("SELECT `DocsName` FROM managedocs "
				+ "INNER JOIN loanrequiredocs WHERE managedocs.id = loanrequiredocs.`ManageDocsId`"
				+ " AND loanrequiredocs.`LoanTypeId` = '"+loanDocsVO.getLoanTypeVO().getId()+"'");*/
		
 		Query q = session.createQuery("from LoanDocsVO where LoanTypeId = " +loanDocsVO.getLoanTypeVO().getId() );
		
		loanDocsList = (List<LoanDocsVO>) q.list();
		}
		catch (HibernateException e) {
			
			e.printStackTrace();
		}
		return loanDocsList;
	}
}
