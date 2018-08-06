package com.stackroute.pe2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;


public class AppTest{
    private static App p;

    @BeforeClass
    public static void setup() {
    	 p=new App();
    }
        

    

    @AfterClass
    public static void teardown() {
       p=null;

    }

    @Test
    public void Palin() {
        
        assertEquals(true, p.Palin("abcba"));
        assertTrue(p.Palin("abcba"));
        assertFalse(p.Palin("abcd"));
    }
//Ex2
@Test
    public void PowerTest()
    {
	int n=4;
	assertEquals(true,p.Power(n));
	assertNotNull(p.Power(n));
	
    }
//Ex3
   	

//ex5
@Test
public void EvenNumTest() {
	assertEquals(true, p.isEven(98));
	assertEquals(false, p.isEven(99));
	assertEquals(false, p.isEven(101));
}
//EX7
@SuppressWarnings("deprecation")
@Test

public void factTest() {
	assertEquals(3628800, p.longFactorial(10));
	assertEquals(1, p.longFactorial(1));
	assertEquals(120, p.longFactorial(5));
}

int[] arr= {86,65,98,77};
@Test
public void average() {
	assertEquals("The average is 81.50",p.average(arr));
}
public void min()
{
	assertEquals("The minimum is 65",p.min(arr));
}
public void max()
{
	assertEquals("The maximum is 98",p.max(arr));
}
}


    