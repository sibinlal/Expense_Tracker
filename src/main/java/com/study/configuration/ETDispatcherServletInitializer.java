package com.study.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ETDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {
				ETDemoAppConfig.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {
				"/"
		};
	}

}
