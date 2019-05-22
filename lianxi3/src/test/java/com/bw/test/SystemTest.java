package com.bw.test;

import org.junit.Test;

import com.bw.DatePAI.SystemUtil;

public class SystemTest {
	
	@Test
	public void funTest(){
		SystemUtil systemUtil = new SystemUtil();
		String userName = systemUtil.getUserName();
		System.out.println(userName);
	}
	
	

}
