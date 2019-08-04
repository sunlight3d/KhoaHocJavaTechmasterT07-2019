package com.springmvc5example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Ramesh Fadatare
 */
public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class <?> [] getRootConfigClasses() {
        ///usr/bin/apache-maven-3.6.1/bin/mvn clean install
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Class <?> [] getServletConfigClasses() {
        return new Class[] {
            AppConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
            "/"
        };
    }
}