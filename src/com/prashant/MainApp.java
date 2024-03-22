package com.prashant;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseConnection D1 = ConnectionFactory.createConnection("mysql");
		D1.connect();
		// work with database of sql
		
		D1.disconnect();
		
		DataBaseConnection D2 = ConnectionFactory.createConnection("oracle");
		D2.connect();
		//work with database of oracle
		D2.disconnect();
		
	}

}
