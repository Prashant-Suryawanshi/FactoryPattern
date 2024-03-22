package com.prashant;

public class MySQL implements DataBaseConnection {

	@Override
	public void connect() {
		System.out.println("MySQL database is connecting...");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("MySQL database is disconnecting...");
	}

}
