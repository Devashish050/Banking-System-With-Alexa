package com.project.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.project.model.ApplyForLoanVO;
import com.project.model.LoanDocsVO;
import com.project.model.LoanTypeVO;
import com.project.model.LoginVO;
import com.project.model.ManageLoanRateVO;
import com.project.service.ApplyForLoanService;
import com.project.service.LoanDocsService;
import com.project.service.LoanTypeService;
import com.project.service.LoginService;
import com.project.service.ManageLoanRateService;
import com.project.utils.Basemethods;

@Controller 
public class ApplyLoanController {
 
	@Autowired  
	LoginService loginService; 
	@Autowired  
	ApplyForLoanService applyForLoanService;
	@Autowired 
	LoanTypeService loanTypeService;
	@Autowired
	ManageLoanRateService manageLoanRateService;    
	@Autowired
	LoanDocsService loanDocsService;
	   

	@GetMapping(value = "/user/loadLoanApply")
	public ModelAndView loadLoanType(@ModelAttribute ApplyForLoanVO applyForLoanVO) {

		String userName = Basemethods.getUser();

		List<?> loginList = this.loginService.searchLoginID(userName);
		LoginVO loginVO = (LoginVO) loginList.get(0);
		int loginId = loginVO.getId();
		loginVO.setId(loginId);
		applyForLoanVO.setLoginVO(loginVO);
		List<?> applyLoanList = this.applyForLoanService.searchApplyLoan(applyForLoanVO);
		List<?> loanTypeList = this.loanTypeService.searchLoanType();
		List<?> manageLoanRateList = this.manageLoanRateService.searchLoanRate();

		ApplyForLoanVO applyForLoanVO2;

		if (applyLoanList.size() > 0) {
			applyForLoanVO2 = (ApplyForLoanVO) applyLoanList.get(0);
		} else {
			applyForLoanVO2 = new ApplyForLoanVO();
		}

		return new ModelAndView("user/loanApply", "ApplyForLoanVO", applyForLoanVO2)
				.addObject("loanTypeList", loanTypeList).addObject("manageLoanRateList", manageLoanRateList);

	}

	@PostMapping(value = "user/insertLoanApply")
	public ModelAndView insertLoanApply(HttpSession session,@ModelAttribute ApplyForLoanVO applyForLoanVO, 
			@RequestParam MultipartFile idProofFile ,@RequestParam MultipartFile residentProofFile,@RequestParam String docStatus) {

		
		String userName = Basemethods.getUser();

		List<?> loginList = this.loginService.searchLoginID(userName);
		LoginVO loginVO;
		loginVO = (LoginVO) loginList.get(0);
		int loginId = loginVO.getId();
		loginVO.setId(loginId);
		applyForLoanVO.setLoginVO(loginVO);
		applyForLoanVO.setDocStatus(docStatus);

		String path = session.getServletContext().getRealPath("/");
		String userDir = Basemethods.getUser();
		System.out.println("user directory name :::"+userDir);
		String path1 =  path + "documents\\applyloandocs\\";
		System.out.println("path1 ::::::::"+path1);
		File userFile = new File(path1 + userDir );
		System.out.println("userFile is created or not ???"+userFile.mkdir());
		
		String finalPath = path + "documents\\applyloandocs\\" + userDir + "\\";
		session.setAttribute("filePathData", finalPath);
		session.setAttribute("userDirectory", userDir);
		System.out.println("final path :::::::"+finalPath);

			String idProofFilePath = Basemethods.uploadFile(finalPath, idProofFile);
			System.out.println("idProofFilePath :::"+idProofFilePath);
			applyForLoanVO.setIdProofFileName(idProofFile.getOriginalFilename());
			applyForLoanVO.setIdProofFilePath(idProofFilePath);
			String residentProofFilePath = Basemethods.uploadFile(finalPath, residentProofFile);
			System.out.println("residentProofFilePath :::"+residentProofFilePath);
			
			applyForLoanVO.setResidentProofFileName(residentProofFile.getOriginalFilename());
			applyForLoanVO.setResidentProofFilePath(residentProofFilePath);

			this.applyForLoanService.insertApplyLoan(applyForLoanVO);

		return new ModelAndView("/user/index");
	}

	@GetMapping(value = "user/ajaxLoanRateSearch")
	public ResponseEntity<?> ajaxLoanRateSearch(@RequestParam int loanTypeId,
			@ModelAttribute ManageLoanRateVO manageLoanRateVO, @ModelAttribute LoanTypeVO loanTypeVO) {

		loanTypeVO.setId(loanTypeId);
		manageLoanRateVO.setLoanTypeVO(loanTypeVO);
		List<?> loanRateList = this.applyForLoanService.ajaxLoanRateSearch(manageLoanRateVO);
		ManageLoanRateVO loanRateVO2 = (ManageLoanRateVO) loanRateList.get(0);
		return new ResponseEntity(loanRateVO2, HttpStatus.OK);

	}

	@GetMapping(value = "/user/ajaxLoanDocs")
	public ResponseEntity ajaxLoanDocs(@ModelAttribute LoanDocsVO loanDocsVO, LoanTypeVO loanTypeVO,
			@RequestParam int loanTypeId, HttpSession session) {
		
		loanTypeVO.setId(loanTypeId);
		loanDocsVO.setLoanTypeVO(loanTypeVO);
		
		System.out.println("loantypeid from controller :::" + loanTypeId);
		List<?> loanDocslist = this.loanDocsService.searchByDocsName(loanDocsVO);
		System.out.println("loanlist ::::" + loanDocslist.size());
		
		return new ResponseEntity(loanDocslist, HttpStatus.OK);
	}

	@GetMapping(value = "admin/viewUserLoan")
	public ModelAndView viewUserLoan(@ModelAttribute ApplyForLoanVO applyForLoanVO) {
		
		List<?> userLoanList = this.applyForLoanService.searchApplyLoanForAdmin();
		return new ModelAndView("admin/viewUserLoan", "userLoanList", userLoanList);

	}
	
	@RequestMapping(value={"admin/approveLoan", "admin/rejectLoan"}, method = RequestMethod.GET)
	public ModelAndView verifyUserLoan(@ModelAttribute ApplyForLoanVO applyForLoanVO,@RequestParam String email,@RequestParam int id,@RequestParam String status) {
		
		
		System.out.println("applyLoanId :::::"+id);
		System.out.println("email :::::"+email);
		System.out.println("docstatus :::::::"+status);
		LoginVO loginVO = new LoginVO();
		loginVO.setUsername(email);
		
		applyForLoanVO.setId(id);
		applyForLoanVO.setLoginVO(loginVO);
		
		List<?> userLoanList = this.applyForLoanService.findById(applyForLoanVO);
		
		ApplyForLoanVO applyForLoanVO2 = (ApplyForLoanVO) userLoanList.get(0);
		applyForLoanVO2.setDocStatus(status);
		
		this.applyForLoanService.insertApplyLoan(applyForLoanVO2);
	
		Basemethods.sendLoanResponse(email, status);
		return new ModelAndView("redirect:/admin/viewUserLoan");

	}
	
	@GetMapping(value = "user/viewPreviousUserLoan")
	public ModelAndView viewPreviousUserLoan(@ModelAttribute ApplyForLoanVO applyForLoanVO) {
		
		String userName = Basemethods.getUser();
		List<?> loginList = this.loginService.searchLoginID(userName);
		LoginVO loginVO = (LoginVO) loginList.get(0);
		applyForLoanVO.setLoginVO(loginVO);
		List<?> userLoanList = this.applyForLoanService.searchApplyLoan(applyForLoanVO);
		return new ModelAndView("user/viewPreviousLoan", "userLoanList", userLoanList); 

	}
	
}
