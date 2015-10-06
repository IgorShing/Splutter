package com.material.patterns.servicelocator;

public class ServiceLocator {

	private static Cache cache;

	static {
		cache = new Cache();
	}

	public static Service getService(String jndiName){

		Service service = cache.getService(jndiName);
		if(service != null){
			return service;
		}
		// Find the service
		InitialContext context = new InitialContext();
		Service service1 = (Service)context.lookup(jndiName);

		// Cache the found service
		cache.addService(service1);
		return service1;
	}
}
