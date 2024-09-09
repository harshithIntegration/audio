package com.audiofusion.audiofusion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.audiofusion.audiofusion.dto.audiofusionUser;
@Component
public interface audiofusionUserRepository extends JpaRepository<audiofusionUser, Integer>{

	audiofusionUser findByPhone(long phone);

}
