package com.cgi.steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ZDemo1Prop {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties prop=new Properties();
		prop.load(new FileInputStream("src/test/resources/config.properties"));
		
		String value=prop.getProperty("explicit.wait");
		System.out.println(value);
		
		
	}

}
