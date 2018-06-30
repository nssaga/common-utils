/**
  StatusCode.java
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
package org.app.wms.commonutils.constants;

public enum StatusCode {

	USER_NOT_FOUND("ERR_CM_001", "User Not Found"),
	DB_EXCEPTION("ERR_CM_002", "Database Operation Exception"),
	UNKNOWN_EXCEPTION("ERR_CM_003","Unknown Exception"),
	INVALID_TOKEN("ERR_CM_004","Invalid Token");

	
	private final String code;
	private final String message;

	private StatusCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
