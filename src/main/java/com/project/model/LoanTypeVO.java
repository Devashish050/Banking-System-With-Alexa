package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loantype")
public class LoanTypeVO {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="LoanType")
	private String loanType;
	
	@Column(name="LoanTypeDescription")
	private String loanTypeDescription;
	
	@Column(name="status")
	private boolean status=true;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanTypeDescription() {
		return loanTypeDescription;
	}

	public void setLoanTypeDescription(String loanTypeDescription) {
		this.loanTypeDescription = loanTypeDescription;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
