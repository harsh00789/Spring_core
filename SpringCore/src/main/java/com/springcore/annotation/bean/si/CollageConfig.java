package com.springcore.annotation.bean.si;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class CollageConfig {

	@Bean
	public Collage CollageBean() {
		Collage c = new Collage();
		c.setId(11);
		c.setName("harsh");
		return c;
		
	}
	
}
