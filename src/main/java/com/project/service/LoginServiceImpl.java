package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.LoginDAO;
import com.project.model.LoginVO;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;

	
	@Transactional
	public void insertLogin(LoginVO loginVO) {
		// TODO Auto-generated method stub
		loginDAO.insertLogin(loginVO);
	}

	@Transactional
	public List<LoginVO> searchLoginID(String loginService) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<LoginVO> ls = loginDAO.searchLoginID(loginService);
		return ls;
	}
}
