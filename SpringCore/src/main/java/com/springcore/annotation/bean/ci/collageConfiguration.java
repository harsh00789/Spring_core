package com.springcore.annotation.bean.ci;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class collageConfiguration {
	
	@Bean
	public collage collageBean() {
		
		return new collage(13,"harsh");
	}
	@Bean
	public collage collageBea() {
	
		return new collage(12);
	}
	
}
