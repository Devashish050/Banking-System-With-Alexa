package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.AccountTypeVO;
@Repository
public class AccountTypeDAOImpl implements AccountTypeDAO {

	
		@Autowired
		private SessionFactory sessionFactory;
		
		@Override
		public void insertAccountType(AccountTypeVO accountTypeVO)
		{
			try {
				Session session = sessionFactory.getCurrentSession();
				session.saveOrUpdate(accountTypeVO);
				}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		
		@SuppressWarnings("unchecked")
		public List<AccountTypeVO> searchAccountType()
		{
			List<AccountTypeVO> accountList = new ArrayList<AccountTypeVO>();
			try{
		 		Session session = sessionFactory.getCurrentSession();
				Query q = session.createQuery("from AccountTypeVO where status = true");
				accountList = q.list();

				}
				catch (Exception e) {
					
					e.printStackTrace();
				}
			return accountList;
		}
		
		@SuppressWarnings("unchecked")
		public List<AccountTypeVO> searchByID(AccountTypeVO accountTypeVO)
		{
			List<AccountTypeVO> accountList = new ArrayList<AccountTypeVO>();
			try{
	 		Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from AccountTypeVO where status = true and id="+accountTypeVO.getId());
			accountList = (List<AccountTypeVO>) q.list();
			}
			catch (Exception e) {
				
				e.printStackTrace();
			}
			return accountList;
			
		}

}
