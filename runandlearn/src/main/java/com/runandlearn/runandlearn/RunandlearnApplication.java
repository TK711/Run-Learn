package com.runandlearn.runandlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class RunandlearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunandlearnApplication.class, args);
	}

}
