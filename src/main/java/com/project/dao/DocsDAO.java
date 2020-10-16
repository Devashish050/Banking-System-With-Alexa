package com.project.dao;

import java.util.List;

import com.project.model.DocsVO;

public interface DocsDAO {

	void insertDocs(DocsVO docsVO);
	
	List<DocsVO> searchDocs();
	
	List<DocsVO> SearchByID(DocsVO docsVO);
	
}
