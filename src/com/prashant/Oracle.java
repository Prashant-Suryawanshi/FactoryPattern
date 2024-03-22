package com.prashant;

public class Oracle implements DataBaseConnection {

	@Override
	public void connect() {
	System.out.println("Oracle database is connected...");
	}

	@Override
	public void disconnect() {
		System.out.println("Oracle database is disconnected...");
	}

}
