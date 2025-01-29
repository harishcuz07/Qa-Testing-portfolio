package com.qa.hs.tests;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.qa.hs.keyword.base.Base;
import com.qa.hs.keyword.engine.KeyWordEngine;

import utilities.MyScreenRecorder;
/**
 * 
 * @author NaveenKhunteta
 *
 */
public class LoginTest {
	

	public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest() throws Exception{
		MyScreenRecorder.startRecording("navigationTest");

		
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
		
		MyScreenRecorder.stopRecording();

	}
	
	/*@Test
	public void signUpTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("signup");
	}*/
	
	
	

}
