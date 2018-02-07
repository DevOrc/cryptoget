package com.noahcharlton.cryptoget;

import java.util.logging.Logger;

import com.noahcharlton.cryptoget.json.Parser;
import com.noahcharlton.cryptoget.request.RequestHandler;

/**
 * 
 * The main class for Cryptoget. Used to retrieve currencies
 * from CoinMarketCap.
 * 
 * @author Noah
 * @version 0.1
 */
public final class Cryptoget {
	
	/**
	 * The Logger for Cryptoget
	 */
	public static final Logger logger = Logger.getLogger("com.noahcharlton.cryptoget");
	
	/**
	 * Handles all HTTP Requests
	 */
	private static final RequestHandler retriever = new RequestHandler();
	
	/**
	 * @see Currencies#BITCOIN
	 * @see #getCurrency(String)
	 */
	public static Currency getBitcoin() {
		return getCurrency(Currencies.BITCOIN.id);
	}
	
	/**
	 * @see Currencies#ETHEREUM
	 * @see #getCurrency(String)
	 */
	public static Currency getEthereum() {
		return getCurrency(Currencies.ETHEREUM.id);
	}
	
	/**
	 * @see Currencies#LITECOIN
	 * @see #getCurrency(String)
	 */
	public static Currency getLitecoin() {
		return getCurrency(Currencies.LITECOIN.id);
	}
	
	/**
	 * Creates a {@link Currency} using data from CoinMarketCap
	 */
	public static Currency getCurrency(String id) {
		Parser p = new Parser(retriever.sendRequest(id));
		p.parse();
		return p.getCurrency();
	}
	
	public enum Currencies{
		BITCOIN("bitcoin"),
		LITECOIN("litecoin"),
		ETHEREUM("ethereum");

		String id;
		
		private Currencies(String id) {
			this.id = id;
		}
		
		public String getId() {
			return id;
		}
		
	}
	
	public RequestHandler getRetriever() {
		return retriever;
	}

}
