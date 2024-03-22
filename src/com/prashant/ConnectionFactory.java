package com.prashant;

public class ConnectionFactory {
	public static DataBaseConnection createConnection(String connectionType) {
		if(connectionType.equalsIgnoreCase("mysql")) {
			return new MySQL();
		}else if(connectionType.equalsIgnoreCase("oracle")) {
			return new Oracle();
		}else {
			 throw new IllegalArgumentException("Invalid database type");
		}
		
	}
}
