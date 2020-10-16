package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GraphDAOImp implements GraphDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<?> viewLoanGraph() {
		List<?> loanList = new ArrayList();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createSQLQuery(
					"SELECT manageloanrate.`LoanRate`,loantype.`LoanType` FROM manageloanrate"
					+ " INNER JOIN loantype ON manageloanrate.`LoanTypeId` =  loantype.`Id`;");
			loanList = q.list();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return loanList;
	}
	
	public List<?> maximumLoanCount()
	{
		List<?> loanList = new ArrayList();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createSQLQuery("SELECT COUNT(*) , loantype.`LoanType` FROM `applyforloan` "
					+ "INNER JOIN loantype WHERE applyforloan.`LoanTypeId` = loantype.`Id` GROUP BY loantype.`LoanType;");
			loanList = q.list();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return loanList;
	}
}
