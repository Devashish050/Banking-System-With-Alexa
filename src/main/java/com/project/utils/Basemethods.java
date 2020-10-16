package com.project.utils;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.multipart.MultipartFile;

public class Basemethods {

	public static String uploadFile(String finalPath, MultipartFile file) {

		String fileName = file.getOriginalFilename();
		try {
			byte[] b = file.getBytes();

			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
					new FileOutputStream(finalPath + fileName));

			bufferedOutputStream.write(b);
			bufferedOutputStream.flush();
			bufferedOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return finalPath ;

	}

	public static String getUser() {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return user.getUsername();
	}

	public static String generatePassword() {

		int n = 8;
		// chose a Character random from this String
		String AlphaNumericString = "0123456789";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

	public static void sendMail(String receiver, String securityKey) {

		final String from = "noreply.b@gmail.com";
		final String username = "";
		final String password = "b1234";

		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		props.put("mails.smtp.ssl.trust", "smtp.gmail.com");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
			message.setSubject("Approve ");

			/*
			 * int num = 0; String pass = ""; for (int i = 0; i < 4; i++) { num
			 * = (int) (Math.random() * 10); pass += num; }
			 * 
			 * System.out.println(pass);
			 * 
			 * s.setAttribute("password", pass);
			 */

			message.setText("Hello ,  your password is " + securityKey);

			Transport.send(message);

			System.out.println("Sent message successfully....");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	
	public static void sendLoanResponse(String receiver, String loanDocStatus) {

		final String from = "noreply.b@gmail.com";
		final String username = "";
		final String password = "b1234";

		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		props.put("mails.smtp.ssl.trust", "smtp.gmail.com");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
			message.setSubject("Approve ");

			message.setText("Hello ," + receiver + " your loan is " + loanDocStatus);

			Transport.send(message);

			System.out.println("Sent message successfully....");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String []args)
	{
		
		Basemethods.sendLoanResponse("dm124@gmail.com", "Approve");
	}

}
