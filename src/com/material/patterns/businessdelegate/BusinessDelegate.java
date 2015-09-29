package com.material.patterns.businessdelegate;

public class BusinessDelegate {

	private BusinessLookUp	businessLookUp	= new BusinessLookUp();
	private BusinessService	businessService;
	private String	        serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	void doTask() {
		businessService = businessLookUp.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}
