package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.AccountDocsVO;

@Repository
public class AccountDocsDAOImpl implements AccountDocsDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void insertAccountDocs(AccountDocsVO accountDocsVO)
	{
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(accountDocsVO);
			}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	@SuppressWarnings("unchecked")
	public List<AccountDocsVO> searchAccountDocs()
	{
		List<AccountDocsVO> accountDocsList = new ArrayList<AccountDocsVO>();
		try{
	 		Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from AccountDocsVO where status = true");
			accountDocsList = q.list();

			}
			catch (Exception e) {
				
				e.printStackTrace();
			}
		return accountDocsList;
	}
	
	@SuppressWarnings("unchecked")
	public List<AccountDocsVO> SearchByID(AccountDocsVO accountDocsVO)
	{
		List<AccountDocsVO> accountDocsList = new ArrayList<AccountDocsVO>();
		try{
 		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from AccountDocsVO where status = true and id="+accountDocsVO.getId());
		accountDocsList = (List<AccountDocsVO>) q.list();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return accountDocsList;

		
	}

	
}
