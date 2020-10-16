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
@Table(name="applyforloan")
public class ApplyForLoanVO {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="LoanTypeId")
	private LoanTypeVO loanTypeVO;
	
	@ManyToOne
	@JoinColumn(name="LoanRateId")
	private ManageLoanRateVO manageLoanRateVO;
	
	@ManyToOne
	@JoinColumn(name="LoginId")
	private LoginVO loginVO;
	
	@Column(name="IdProofFileName") 
	private String idProofFileName;

	@Column(name="IdProofFilePath")
	private String idProofFilePath;
	
	@Column(name="ResidentProofFileName")
	private String residentProofFileName;

	@Column(name="ResidentProofFilePath")
	private String residentProofFilePath;

	@Column(name="docStatus")
	private String docStatus;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LoanTypeVO getLoanTypeVO() {
		return loanTypeVO;
	}

	public void setLoanTypeVO(LoanTypeVO loanTypeVO) {
		this.loanTypeVO = loanTypeVO;
	}

	public ManageLoanRateVO getManageLoanRateVO() {
		return manageLoanRateVO;
	}

	public void setManageLoanRateVO(ManageLoanRateVO manageLoanRateVO) {
		this.manageLoanRateVO = manageLoanRateVO;
	}

	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

	public String getIdProofFileName() {
		return idProofFileName;
	}

	public void setIdProofFileName(String idProofFileName) {
		this.idProofFileName = idProofFileName;
	}

	public String getIdProofFilePath() {
		return idProofFilePath;
	}

	public void setIdProofFilePath(String idProofFilePath) {
		this.idProofFilePath = idProofFilePath;
	}

	public String getResidentProofFileName() {
		return residentProofFileName;
	}

	public void setResidentProofFileName(String residentProofFileName) {
		this.residentProofFileName = residentProofFileName;
	}

	public String getResidentProofFilePath() {
		return residentProofFilePath;
	}

	public void setResidentProofFilePath(String residentProofFilePath) {
		this.residentProofFilePath = residentProofFilePath;
	}

	public String getDocStatus() {
		return docStatus;
	}

	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}

	
	
}
