/**
 * 
 */
package com.sai.mrb.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author sv
 *
 */

@Configuration
@ComponentScan({ "com.sai.mrb" })
public class FrontController {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vResolver  = new InternalResourceViewResolver();
		vResolver.setPrefix("/WEB_INF/");
		vResolver.setSuffix(".jsp");
		return vResolver;
	}

}




