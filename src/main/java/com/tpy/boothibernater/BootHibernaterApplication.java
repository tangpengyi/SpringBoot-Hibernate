package com.tpy.boothibernater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories
public class BootHibernaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootHibernaterApplication.class, args);
	}

}
