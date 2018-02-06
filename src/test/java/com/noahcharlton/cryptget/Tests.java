package com.noahcharlton.cryptget;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
