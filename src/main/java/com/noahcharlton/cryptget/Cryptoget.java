package com.noahcharlton.cryptget;

import java.util.logging.Logger;

import com.noahcharlton.cryptget.json.Parser;
import com.noahcharlton.cryptget.request.RequestHandler;

public final class Cryptoget {
	
	public static final Logger logger = Logger.getLogger("com.noahcharlton.cryptoget");
	
	private static final RequestHandler retriever = new RequestHandler();
	
	public static Currency getBitcoin() {
		return getCurrency(Currencies.BITCOIN);
	}
	
	public static Currency getEthereum() {
		return getCurrency(Currencies.ETHEREUM);
	}
	
	public static Currency getLitecoin() {
		return getCurrency(Currencies.LITECOIN);
	}
	
	public static Currency getCurrency(String id) {
		Parser p = new Parser(retriever.sendRequest(id));
		p.parse();
		return p.getCurrency();
	}
	
	public static final class Currencies{
		public static final String BITCOIN = "bitcoin";
		public static final String ETHEREUM = "ethereum";
		public static final String LITECOIN = "litecoin";

	}
	
	public RequestHandler getRetriever() {
		return retriever;
	}

}
