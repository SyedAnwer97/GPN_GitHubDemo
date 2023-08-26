package com.GPN.Utilitys;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
	public Readconfig() {
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream FIS = new FileInputStream(src);
			pro = new Properties();
			pro.load(FIS);
		} catch (Exception e) {
			System.out.println("exception is " + e.getMessage());
		}
		}
		
	public String webURL() {
		String url= pro.getProperty("url");
		return url;
		}
	
	public String GetCustomername() {
		String Cusname= pro.getProperty("CustomerName");
		return Cusname;
		}
	
	public String GetPassword() {
		String Cuspaswrd= pro.getProperty("Password");
		return Cuspaswrd;
		}
	
	public String GPNLangauge() {
		String lang= pro.getProperty("Langauge");
		return lang;
		}
	
	public String GetOpname() {
		String opname= pro.getProperty("Opname");
		return opname;
		}
	
	public String GetOpPassword() {
		String oppaswrd= pro.getProperty("OpPasswrd");
		return oppaswrd;
		}
	 
}

