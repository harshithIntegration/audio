package com.audiofusion.audiofusion.responceBody;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.audiofusion.audiofusion.dto.audiofusionUser;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class userResponce {
	private String message;
	private boolean status;
	private String statusMessage;
	private HttpStatus statusCode;
	private audiofusionUser body;
}
