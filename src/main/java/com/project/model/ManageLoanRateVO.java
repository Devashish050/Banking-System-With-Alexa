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
@Table(name="manageloanrate")
public class ManageLoanRateVO {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="LoanRate")
	private String loanRate;
	
	@Column(name="LoanRateDescription")
	private String loanRateDescription;
	
	@ManyToOne
	@JoinColumn(name="LoanTypeId")
	private LoanTypeVO loanTypeVO;

	@Column(name="status")
	private boolean status=true;

	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoanRate() {
		return loanRate;
	}

	public void setLoanRate(String loanRate) {
		this.loanRate = loanRate;
	}

	public String getLoanRateDescription() {
		return loanRateDescription;
	}

	public void setLoanRateDescription(String loanRateDescription) {
		this.loanRateDescription = loanRateDescription;
	}

	public LoanTypeVO getLoanTypeVO() {
		return loanTypeVO;
	}

	public void setLoanTypeVO(LoanTypeVO loanTypeVO) {
		this.loanTypeVO = loanTypeVO;
	}
	
}
