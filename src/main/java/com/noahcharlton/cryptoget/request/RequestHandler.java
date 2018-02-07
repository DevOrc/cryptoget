package com.noahcharlton.cryptoget.request;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class RequestHandler {

	public RequestHandler() {

	}

	public HttpURLConnection sendRequest(String id) {
		URL url = null;
		
		//Create the connection
		try {
			url = new URL("https://api.coinmarketcap.com/v1/ticker/"+id);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		//Open the connection
		HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Set the request method 
		try {
			if(conn != null)
				conn.setRequestMethod("GET");
		} catch (ProtocolException e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
