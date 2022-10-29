package com.sportyshoes;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	public DispatcherServletConfig() {
		System.out.println("DispatcherServletConfig constructor");
		System.out.println("load dispatcher srevlet");
	}
	@Override
	protected Class<?>[] getRootConfigClasses(){
		return null;
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses(){
		// tells the dispatcher serbvlet which class is responsible for configurations
		return new Class[] {WebConfig.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		// for the url mapping
		return new String[] {"/"};
	}
	
}
