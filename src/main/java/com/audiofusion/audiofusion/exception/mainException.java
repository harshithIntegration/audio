package com.audiofusion.audiofusion.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.audiofusion.audiofusion.responceBody.userResponce;

public class mainException {
	@Autowired
	userResponce responce;
	
	@ExceptionHandler(commonException.class)
	public ResponseEntity<userResponce> handleCommonException(commonException exception){
		responce.setStatus(false);
		responce.setStatusMessage("error");
		responce.setMessage(exception.getMessage());
		responce.setStatusCode(HttpStatus.CONFLICT);
		return new ResponseEntity<userResponce>(responce,HttpStatus.CONFLICT);
		
	}

}
