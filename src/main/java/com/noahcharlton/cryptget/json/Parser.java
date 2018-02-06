package com.noahcharlton.cryptget.json;

import java.io.IOException;
import java.net.HttpURLConnection;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

import com.noahcharlton.cryptget.Cryptoget;
import com.noahcharlton.cryptget.Currency;

public class Parser {

	private JsonParser parser;
	private Currency currency;

	public Parser(HttpURLConnection conn) {
		try {
			parser = Json.createParser(conn.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void parse() {
		String keyName = "";
		currency = new Currency();
		
		while(parser.hasNext()) {
			Event event = parser.next();

			switch (event) {
			case KEY_NAME:
				keyName = parser.getString();
				break;
			case VALUE_STRING:
				setValue(currency, keyName, parser.getString());
				break;
			default:
				//Events we don't care about such as, Start, end, value_number, etc.
			}
		}
		
	}

	private void setValue(Currency c, String key, String value) {
		System.out.printf("%s: %s\n", key, value);
		switch (key) {
		case "name":
			c.setName(value);
			break;
		case "id":
			c.setId(value);
			break;
		case "symbol":
			c.setSymbol(value);
			break;
		case "rank":
			c.setRank(value);
			break;
		case "price_usd":
			c.setPriceUSD(value);
			break;
		case "error":
			Cryptoget.logger.severe("Error Returned: " + value);
			break;
		default:	
			//Keys we don't care about
		}
	}

	public Currency getCurrency() {
		return currency;
	}

}
