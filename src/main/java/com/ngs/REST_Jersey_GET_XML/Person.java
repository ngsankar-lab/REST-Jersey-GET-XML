package com.ngs.REST_Jersey_GET_XML;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	private int pid;
	private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
}