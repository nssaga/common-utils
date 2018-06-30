/**
  NotFoundException.java
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

import org.app.wms.commonutils.constants.StatusCode;

public class NotFoundException extends Exception {
	private static final long serialVersionUID = 3780111315542190238L;
	private String code;
	private String message;

	public NotFoundException(StatusCode code) {
		this.code = code.getCode();
		this.message = code.getMessage();
	}

	public NotFoundException(String code, String message) {
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
