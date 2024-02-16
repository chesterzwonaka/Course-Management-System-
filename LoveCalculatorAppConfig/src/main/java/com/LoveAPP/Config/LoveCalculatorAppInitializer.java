package com.LoveAPP.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoveCalculatorAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		Class<?> arr[] = { LoveCalculatorAppConfig.class };
		return arr;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?> arr[] = { LoveCalculatorAppConfig.class };
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = { "/" };
		return arr;
	}

}
