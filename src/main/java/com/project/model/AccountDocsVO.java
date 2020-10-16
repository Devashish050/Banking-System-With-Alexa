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
@Table(name="accountdocuments")
public class AccountDocsVO {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)		
	private int id;
	
	@ManyToOne
	@JoinColumn(name="AccountTypeId")
	private AccountTypeVO accountTypeVO;
	
	@ManyToOne
	@JoinColumn(name="DocId")
	private DocsVO docsVO;
	
	@Column(name="Status")
	private boolean status =true;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AccountTypeVO getAccountTypeVO() {
		return accountTypeVO;
	}

	public void setAccountTypeVO(AccountTypeVO accountTypeVO) {
		this.accountTypeVO = accountTypeVO;
	}

	public DocsVO getDocsVO() {
		return docsVO;
	}

	public void setDocsVO(DocsVO docsVO) {
		this.docsVO = docsVO;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
