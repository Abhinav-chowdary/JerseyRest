package com.Abhi.Jersey.JerseyRest.MongoConnection;

import javax.inject.Singleton;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoConnection {

	public String MongoConnect() {
		
		try {
		MongoClient mc=new MongoClient(new MongoClientURI("mongodb+srv://root:root@cluster29-xgscb.mongodb.net/test?retryWrites=true&w=majority"));
		
		
		return "connection success";
		}catch(Exception e) {
			System.out.println(e);
			return "connection failed";
		}
		
	}
	}
