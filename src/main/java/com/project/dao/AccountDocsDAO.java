package com.project.dao;

import java.util.List;

import com.project.model.AccountDocsVO;

public interface AccountDocsDAO {

	void insertAccountDocs(AccountDocsVO accountDocsVO);
	
	List<AccountDocsVO> searchAccountDocs();
	
	List<AccountDocsVO> SearchByID(AccountDocsVO accountDocsVO);

}
