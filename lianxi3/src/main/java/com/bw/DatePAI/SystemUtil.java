package com.bw.DatePAI;

public class SystemUtil {
	
	//获取用户名
    public String getUserName(){
    	String userName = System.getProperties().getProperty("user.name");
		return userName;
    }

	//获取用户目录
	public String getUserHome(){
		String userHome = System.getProperties().getProperty("user.name");
		return userHome;
	}
	//获取临时目录
	public String getTemFile(){
		String temPath = System.getProperties().getProperty("java.io.temdir");
		return temPath;
	}
}
