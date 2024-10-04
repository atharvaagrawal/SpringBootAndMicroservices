package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pi")
public class PersonInfo {
	
	// Injecting the values from the properties file
	
	@Value("${per.id}")
	private int id;
	
	@Value("${per.name}")
	private String name;
	
	@Value("${per.bill}")
	private float billAmt;
	
	
	// Injecting the values directly
	@Value("mh")
	private String address;
	
	
	// Injecting the system property values
	@Value("${os.name}")
	private String osName;
	
	@Value("${os.version}")
	private String osVer;
	
	
	// Injecting the env variable value
	@Value("${Path}")
	private String pathData;

	// toString()
	// alt+shift+s+s
	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", name=" + name + ", billAmt=" + billAmt + ", address=" + address + ", osName="
				+ osName + ", osVer=" + osVer + ", pathData=" + pathData + "]";
	}
	
}
