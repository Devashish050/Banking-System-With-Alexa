package com.project.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ComplainDAO;
import com.project.model.ComplainVO;

@Service
@Transactional
public class ComplainServiceImpl implements ComplainService{

	@Autowired
	ComplainDAO complainDAO;
	
	public void insertComplain(ComplainVO complainVO)
	{
		this.complainDAO.insertComplain(complainVO);
	}
	
	public List<ComplainVO> adminViewComplain()
	{
		return this.complainDAO.adminViewComplain();
	}
	public List searchComplaint(ComplainVO complainVO) {
		
		List complaintList = this.complainDAO.searchComplaint(complainVO);
		
		return complaintList;	
	}
	
	public List<ComplainVO> SearchByID(ComplainVO complainVO)
	{
		return this.complainDAO.SearchByID(complainVO);
	}
	
	public List<ComplainVO> viewPendingComplain(ComplainVO complainVO)
	{
		return this.complainDAO.viewPendingComplain(complainVO);
	}
	
	public List<ComplainVO> viewResolveComplain(ComplainVO complainVO)
	{
		return this.complainDAO.viewResolveComplain(complainVO);
	}


}
