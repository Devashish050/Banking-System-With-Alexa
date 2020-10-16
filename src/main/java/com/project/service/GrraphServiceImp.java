package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.GraphDAO;

@Service
@Transactional
public class GrraphServiceImp implements GraphService {

	@Autowired
	private GraphDAO graphDAO;
	
	public List<?> viewLoanGraph()
	{
		return this.graphDAO.viewLoanGraph();
	}
	
	public List<?> maximumLoanCount()
	{
		return this.graphDAO.maximumLoanCount();
	}
}
