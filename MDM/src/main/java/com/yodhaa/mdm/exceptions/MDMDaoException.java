package com.yodhaa.mdm.exceptions;

public class MDMDaoException extends Exception {

	private static final long serialVersionUID = 1862683015555017057L;

	 public MDMDaoException(String message) {
		 	super(message);
	}
	 
	 public MDMDaoException(String message,Throwable tr) {
		 	super(message,tr);
	}
	 
	 public MDMDaoException(Throwable tr) {
		 	super(tr);
	}
	 
	
}
