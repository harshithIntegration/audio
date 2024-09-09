package com.audiofusion.audiofusion.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.audiofusion.audiofusion.dto.audiofusionUser;
import com.audiofusion.audiofusion.repository.audiofusionUserRepository;

@Component
public class commonDao {
	
	@Autowired
	audiofusionUserRepository audiofusionUserRepository;
	
	public void SignUp(audiofusionUser user) {
		audiofusionUserRepository.save(user);
	}

	public audiofusionUser findByPhone(long phone) {
		return audiofusionUserRepository.findByPhone(phone);
	}

}
