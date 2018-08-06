package com.stackroute.pe2;

public class Member_Variable {
		public Object [] getMemberVariable(String name, int age, double sal) {
			if(name == null || age == 0)
				return null;
			
			Member ob = new Member(name, age, sal);
			
			Object [] arr = {ob.getName(), ob.getAge(), ob.getSalary()};
			
			return arr;
		}
	}

	class Member
	{
		private String name;
		private String age;
		private String Salary;
		
		public Member(String name, int age, double Salary) 
		{
			this.name = name;
			this.age = Integer.toString(age);
			this.Salary = Double.toString(Salary);
		}
		
		String getName() 
		{
			return this.name;
		}
		
		int getAge() 
		{
			return Integer.parseInt(this.age);
		}
		
		double getSalary() 
		{
			return Double.parseDouble(this.Salary);
		}
	}


