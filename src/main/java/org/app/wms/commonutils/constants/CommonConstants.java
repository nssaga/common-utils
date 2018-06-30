/**
  AppConstants.java
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

public interface CommonConstants {
	
	String API_BASE_PATH = "/api/v1";
	
	String REQUEST_TIME = "requestTime";
	
	//RegEx pattern
	String EMAIL_REGEX = "^$|^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	String FIRST_NAME_REGEX = "^[a-zA-Z]{1,25}$";
	String LAST_NAME_REGEX = "^[a-zA-Z]{0,25}$";
	String ADDRESS_REGEX = "^[a-zA-Z0-9 .,:-]{0,255}$";
	String STATE_REGEX = "^[a-zA-Z ]{0,25}$";
	String MOBILE_REGEX =  "^$|^\\d{10,10}$";
	String FB_LOGIN_ID_REGEX = "^[0-9a-zA-Z\\\\.\\\\-\\\\/\\\\_\\\\@]{0,255}$+$";
	
	//Message
	String INVALID_EMAIL = "Invalid Email.";
	
	
}
