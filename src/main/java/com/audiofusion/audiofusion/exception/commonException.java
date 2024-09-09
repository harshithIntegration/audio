package com.audiofusion.audiofusion.exception;

public class commonException extends RuntimeException{
	String message;
	public commonException(String message) {
		super(message);
		this.message=message;
	}
}
