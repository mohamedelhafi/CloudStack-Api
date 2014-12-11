/**
 * 
 */
package com.mh.cloudstack.api.Exceptions;

/**
 * @author mohamedelhafi
 * 
 */
@SuppressWarnings("serial")
public class CloudStackException extends Exception {
	CloudStackException(String errorcode, String errortext) {
		super(errorcode + ": " + errortext);
	}
}
