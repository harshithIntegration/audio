package com.audiofusion.audiofusion.service;

import javax.swing.RepaintManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.audiofusion.audiofusion.dao.commonDao;
import com.audiofusion.audiofusion.dto.audiofusionUser;
import com.audiofusion.audiofusion.exception.commonException;
import com.audiofusion.audiofusion.responceBody.userResponce;

import jakarta.servlet.http.HttpSession;

@Component
public class commonService {
	
	@Autowired
	commonDao commonDao;
	
	@Autowired
	userResponce responce;
	
	public ResponseEntity<userResponce> SignUp(audiofusionUser user, HttpSession httpSession) {
		try {
			System.out.println(user.getPhone());
			audiofusionUser exuser=commonDao.findByPhone(user.getPhone());
			System.out.println(exuser);
			if(exuser==null) {
				commonDao.SignUp(user);
				responce.setMessage("User added");
				responce.setStatus(true);
				responce.setStatusMessage("pass");
				responce.setStatusCode(HttpStatus.CREATED);
				return new ResponseEntity<userResponce>(responce,HttpStatus.CREATED);
			}else {
				responce.setMessage("Already exists");
				responce.setStatus(false);
				responce.setStatusMessage("fail");
				responce.setStatusCode(HttpStatus.NOT_ACCEPTABLE);
				return new ResponseEntity<userResponce>(responce,HttpStatus.NOT_ACCEPTABLE);
			}
			
		} catch (Exception e) {	
			System.out.println(e.getMessage());
			throw new commonException(e.getMessage());
		}
		
	}

}
