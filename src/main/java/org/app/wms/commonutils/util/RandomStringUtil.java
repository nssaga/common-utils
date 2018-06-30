/**
 RandomStringUtil.java
 ***********************************************************************************************************************                                               
 Description: 	This class is used to generate random string.

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 Jun 13, 2018	Nawal Sah				Initial Version

 © 2018, 
 ***********************************************************************************************************************
 */
package org.app.wms.commonutils.util;

import java.security.SecureRandom;
import java.util.Random;

public class RandomStringUtil {
	private static final Random RANDOM = new SecureRandom();

	/**
	 * Generate a random alphanumeric String.
	 * 
	 * @param length
	 * @return
	 */
	public static String generateRandomString(int length) {
		String letters = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789";

		String generatedString = "";
		for (int i = 0; i < length; i++) {
			int index = (int) (RANDOM.nextDouble() * letters.length());
			generatedString += letters.substring(index, index + 1);
		}
		return generatedString;
	}
}
