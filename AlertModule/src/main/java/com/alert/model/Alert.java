package com.alert.model;

public class Alert {
	private String name;
    private String message;
    private String timestamp;
    
    
	public Alert(String name, String message, String timestamp) {
		super();
		this.name = name;
		this.message = message;
		this.timestamp = timestamp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
    
}
