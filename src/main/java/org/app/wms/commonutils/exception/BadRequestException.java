/**
  BadRequestException.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 09-Mar-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package org.app.wms.commonutils.exception;

public class BadRequestException extends Exception {

	private static final long serialVersionUID = -7262662137291242514L;

	private String code;
	private String message;

	public BadRequestException() {
	}

	public BadRequestException(String message) {
		super(message);
		this.message = message;
	}

	public BadRequestException(String code, String message) {
		this.code = code;
		this.message = message;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

}
