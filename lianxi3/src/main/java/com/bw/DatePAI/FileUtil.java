package com.bw.DatePAI;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileUtil {

	public static String readFile(InputStream is){
		BufferedReader br = null;
		StringBuffer sb = new StringBuffer();
		
		try {
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;	
	}
}
