package com.material.patterns.businessdelegate;

public class BusinessLookUp {

	private EJBService	ejbService	= new EJBService();
	private JMSService	jmsService	= new JMSService();

	public BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB")) {
			return ejbService;
		} else {
			return jmsService;
		}
	}
}
