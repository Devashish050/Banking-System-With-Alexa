package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.DocsVO;
@Repository
public class DocsDAOImpl implements DocsDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void insertDocs(DocsVO docsVO)
	{
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(docsVO);
			}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	@SuppressWarnings("unchecked")
	public List<DocsVO> searchDocs()
	{
		List<DocsVO> requiredDocsList = new ArrayList<DocsVO>();
		try{
	 		Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from DocsVO where status = true");
			requiredDocsList = q.list();

			}
			catch (Exception e) {
				
				e.printStackTrace();
			}
		return requiredDocsList;
	}
	
	@SuppressWarnings("unchecked")
	public List<DocsVO> SearchByID(DocsVO docsVO)
	{
		List<DocsVO> requiredDocsList = new ArrayList<DocsVO>();
		try{
 		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from DocsVO where status = true and id="+docsVO.getId());
		requiredDocsList = (List<DocsVO>) q.list();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return requiredDocsList;

		
	}
	
}
