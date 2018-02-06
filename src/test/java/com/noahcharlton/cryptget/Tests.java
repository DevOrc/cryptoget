package com.noahcharlton.cryptget;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

	@Test
	public void basicTest() {
		Currency c = Cryptoget.getBitcoin();
		
		assertEquals("Bitcoin", c.getName());
		assertEquals("bitcoin", c.getId());
	}

}
