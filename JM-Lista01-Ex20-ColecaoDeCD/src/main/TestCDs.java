package main;

import org.junit.Test;

public class TestCDs {
	CDs cdTest = new CDs("nomeCD",1000);
	
	
	@Test
	public void testCDs() {
		CDs cdTest = new CDs("nomeCD",1000);
	}

		
	@Test
	public void testColecaoCD() {
		cdTest.colecaoCD(cdTest);
	}
	
	


}
