package com.material.patterns.nullobject;

public class CustomerFactory {

	private static final String[] names = {"Rob", "Mary", "Antony", "Josepth", "Laura"};

	public static AbstractCustomer getCustomer(String name)
	{
		for (int i = 0; i < names.length; i++)
		{
			if (name.equals(names[i]))
			{
				return new RealCustomer(name);
			}
		}
		// Else return null object
		return new NullCustomer();
	}
}
