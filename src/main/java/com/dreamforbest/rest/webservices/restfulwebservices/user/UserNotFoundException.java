/**
 * 
 */
package com.dreamforbest.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7414317216499764907L;

	public UserNotFoundException(String arg0) {
		super(arg0);
	}

}
