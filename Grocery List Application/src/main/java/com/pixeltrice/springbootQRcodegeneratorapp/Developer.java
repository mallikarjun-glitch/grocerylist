package com.pixeltrice.springbootQRcodegeneratorapp;


public class Developer {

	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private boolean wifi;
	private String wifissid;
	private String wifipassword;

	public Developer() {
		super();
	}

	public Developer(String firstName, String lastName, String email
			) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public String getWifissid() {
		return wifissid;
	}

	public void setWifissid(String wifissid) {
		this.wifissid = wifissid;
	}

	public String getWifipassword() {
		return wifipassword;
	}

	public void setWifipassword(String wifipassword) {
		this.wifipassword = wifipassword;
	}
}
