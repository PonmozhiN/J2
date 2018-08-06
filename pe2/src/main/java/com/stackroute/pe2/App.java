package com.stackroute.pe2;


public class App
{
    public boolean Palin(String str)
    {
StringBuilder a = new StringBuilder();
		
		a.append(str);
		
		if(str.equals(a.reverse().toString()))
			return true;
		else 
		return false;
	}
    

public boolean Power(int n)
{
	if(n % 4 == 0) 
	{
		if(n / 4 == 1)
			n=n/4;
 			return true;
		
	
	}
	return false;
}

public  String Inst(String s)
{
	return s;
}

boolean req=false;
    public boolean isEven(int x)
    {
    	 if((x%2)==0)
    	 {
    		 req=true;
    	 }
    	 else
    	 {
    		 req=false;}
    	 return req;
    }


/*public String intfact(int num)
{
	int i,fact=1;
	for(i=1;i<=num;i++) {
		fact=fact*i;
	}
	
	String s= "The factorial of "+num+" is "+fact;
	
	
	
	return s;
}
*/
public long longFactorial(long num)
{
	int i;
	long fact=1;
	for(i=1;i<=num;i++) {
		fact=fact*i;
	}
	
	/*String s= "The factorial of "+num+" is "+fact;
	*/
	
	
	return fact;	
}


	public String average(int num[])
	{
		int x=num.length,y=0;
		float avg;
		for(int i=0;i<x;i++) {
			y=y+num[i];
		}
		
		avg=y/x;
		avg=(float) (avg+0.50);
		String s= "The average is "+avg+0;
		return s;
	}
	public String min(int num[])
	{
		int temp,min=num[0];
		int x=num.length;
		for(int i=1;i<x;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		String s= "The minimum is "+min;
		return s;
	}
	public String max(int num[])
	{
		int temp,max=num[0];
		
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
		}
		String s= "The maximum is "+max;
		return s;
	}



}