package com.service;

public class UserService {
	
	//여기서 jdbc.properties 주입받을 것임
	
	String driver;
	String url;
	String userid;
	String passwd;
	
	
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "UserService [driver=" + driver + ", url=" + url + ", userid=" + userid + ", passwd=" + passwd + "]";
	}
	
	
}
