package com.project.dao;

import java.util.List;

import com.project.model.LoginVO;

public interface LoginDAO {
	
	public void insertLogin(LoginVO loginVO);

	public List searchLoginID(String loginService);

}
