/**
  RestException.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 16-Mar-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package org.app.wms.commonutils.exception;

import java.util.Date;
import java.util.List;

public class ErrorResponse {

	private Date timestamp;
	private String code;
	private List<?> messages;

	public ErrorResponse() {
	}

	public ErrorResponse(String code, List<?> messages) {
		this.timestamp = new Date();
		this.code = code;
		this.messages = messages;
	}

	public String getCode() {
		return code;
	}

	public List<?> getMessages() {
		return messages;
	}

	public Date getTimestamp() {
		return timestamp;
	}

}