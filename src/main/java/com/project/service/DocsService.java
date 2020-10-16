package com.project.service;

import java.util.List;

import com.project.model.DocsVO;
import com.project.model.LoanDocsVO;

public interface DocsService {

	void insertDocs(DocsVO DocsVO);
	
	List<DocsVO> searchDocs();
	
	List<DocsVO> SearchByID(DocsVO DocsVO);

}
