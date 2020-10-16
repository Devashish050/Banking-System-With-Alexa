package com.project.service;

import java.util.List;

import com.project.model.AccountDocsVO;

public interface AccountDocsService {

	void insertAccountDocs(AccountDocsVO accountDocsVO);
	
	List<AccountDocsVO> searchAccountDocs();
	
	List<AccountDocsVO> SearchByID(AccountDocsVO accountDocsVO);

}
