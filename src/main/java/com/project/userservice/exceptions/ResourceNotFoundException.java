package com.project.userservice.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		super("resource not found exception");
	}
}
