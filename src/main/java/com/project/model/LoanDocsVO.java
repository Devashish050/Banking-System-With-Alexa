package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loanrequiredocs")
public class LoanDocsVO {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Status")
	private boolean status =true;
	
	@Column(name="documentType")
	private String documentType;

	@ManyToOne
	@JoinColumn(name="LoanTypeId")
	private LoanTypeVO loanTypeVO;
	
	@ManyToOne
	@JoinColumn(name="ManageDocsId")
	private DocsVO docsVO;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public LoanTypeVO getLoanTypeVO() {
		return loanTypeVO;
	}

	public void setLoanTypeVO(LoanTypeVO loanTypeVO) {
		this.loanTypeVO = loanTypeVO;
	}

	public DocsVO getDocsVO() {
		return docsVO;
	}

	public void setDocsVO(DocsVO docsVO) {
		this.docsVO = docsVO;
	}

		
}
