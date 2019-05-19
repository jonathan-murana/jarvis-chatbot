package controller;


import resources.ResourceUrlsAmbientes;

public class Controller{

	final public static String resource_urls_ambientes= "urls_ambientes";

	public static String getResponse(String intent) {
		System.out.println("DEBUG::intent=" + intent);

		String aplication = intent.split("-")[0];
		String resource = intent.split("-")[1];
		
		if (resource_urls_ambientes.equals(resource)){
			return ResourceUrlsAmbientes.getResponse(aplication);				
		}

		System.out.println("DEBUG::resource=" + resource);
		System.out.println("DEBUG::aplication=" + aplication);
		System.out.println("DEBUG::resource_urls_ambientes=" + resource_urls_ambientes);

		return "no se pudo determinar el recurso";	

	}

}
