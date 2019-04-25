package com.webservice.soap.axis1;

import java.net.URL;

import org.apache.axis.client.Service;

public class MainAppTestClient {

	public static void main(String[] args) throws Exception{
		String location="http://localhost:8080/WEB-SERVICE-SOAP-JAX-RPC-AXIS-1/services/CalculatorService";
		URL endPointUrl= new URL(location);
		Service service=new Service();
		
		CalculatorServiceSoapBindingStub stub =new CalculatorServiceSoapBindingStub(endPointUrl, service);
		
		int addResult=stub.add(20, 10);
		System.out.println("Result of add: "+addResult);
		
		int subtractResult=stub.subtract(100, 10);
		System.out.println("Result of subtract: "+subtractResult);

	}

}
