package com.sold.easy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SoldEasyApplication
{
	public static void main(String args[])
	{
		SpringApplication.run(SoldEasyApplication.class, args);
	}
}
