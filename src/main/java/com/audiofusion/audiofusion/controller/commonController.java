package com.audiofusion.audiofusion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audiofusion.audiofusion.dto.audiofusionUser;
import com.audiofusion.audiofusion.responceBody.userResponce;
import com.audiofusion.audiofusion.service.commonService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/af")
public class commonController {
	@Autowired
	commonService commonService;
	
	@PostMapping("/signup")
	public ResponseEntity<userResponce> SignUp(@RequestBody audiofusionUser user,HttpSession httpSession){
		return commonService.SignUp(user,httpSession);
	}
}
