package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounttype")
public class AccountTypeVO {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="AccountType")
	private String accountType;
	
	@Column(name="AccountTypeDescription")
	private String accountTypeDescription;
	
	@Column(name="status")
	private boolean status=true;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountTypeDescription() {
		return accountTypeDescription;
	}

	public void setAccountTypeDescription(String accountTypeDescription) {
		this.accountTypeDescription = accountTypeDescription;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
