package com.foottime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class FootTimeApplication extends WebMvcConfigurationSupport {

	public static void main(String[] args) {
		SpringApplication.run(FootTimeApplication.class, args);
	}

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry){
		super.addResourceHandlers(registry);
		registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

}
