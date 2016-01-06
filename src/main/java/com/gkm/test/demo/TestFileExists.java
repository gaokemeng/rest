/**
 * 
 */
package com.gkm.test.demo;

import java.io.File;

public class TestFileExists {

	private String logFileName = "isc.log";
	private File logFile;
	
	public TestFileExists(){
		this.logFile = new File(this.logFileName);
//		boolean mkdir = logFile.mkdir();
//		System.err.println(mkdir);
	    if (this.logFile.exists())
	    {
	    	System.out.println(logFile.getAbsolutePath());
	    }
	    else{
	    	System.out.println("logFile not exist");
	    }
	}
	
	public static void main(String[] args) {
		TestFileExists t = new TestFileExists();
		
		
		
	}
	
}
