package com.stackroute.pe2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MemTest {
	private static Member_Variable obj;
	
	@BeforeClass
	public static void setup() {
		obj = new Member_Variable();
	}
	
	@AfterClass
	public static void teardown() {
		obj = null;
	}
	
	
	
	@Test
	public void getMemVarTest() {

		assertArrayEquals(new Object[] {"Harry Potter", 30 ,2500.3}, obj.getMemberVariable("Harry Potter", 30 ,2500.3));
	    
		assertNotNull(obj.getMemberVariable("Harry Potter", 30 ,2500.3));

		assertNull(null, obj.getMemberVariable(null, 0, 0));
	}
}