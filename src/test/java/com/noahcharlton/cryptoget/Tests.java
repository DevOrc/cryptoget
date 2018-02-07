package com.noahcharlton.cryptoget;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.noahcharlton.cryptoget.Cryptoget;
import com.noahcharlton.cryptoget.Currency;

public class Tests {

	@Test
	public void currencyTest() {
		testCurrency(Cryptoget.getBitcoin(), "Bitcoin", "bitcoin");
		testCurrency(Cryptoget.getEthereum(), "Ethereum", "ethereum");
		testCurrency(Cryptoget.getLitecoin(), "Litecoin", "litecoin");
	}

	private void testCurrency(Currency c, String name, String id) {
		assertEquals(name, c.getName());
		assertEquals(id, c.getId());
	}

}
