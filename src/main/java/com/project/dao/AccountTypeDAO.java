package com.project.dao;

import java.util.List;

import com.project.model.AccountTypeVO;

public interface AccountTypeDAO {

	 void insertAccountType(AccountTypeVO accountTypeVO);
	 
	 List<AccountTypeVO> searchAccountType();
	 
	 List<AccountTypeVO> searchByID(AccountTypeVO accountTypeVO);

}
