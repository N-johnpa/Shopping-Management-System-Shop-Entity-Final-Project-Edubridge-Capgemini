package com.shop.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.SpringVersion;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.shop.system.entity.Shop;
import com.shop.system.repository.ShopRepository;


@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class ShoppingManagementSystemApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		
		 SpringApplication springApplication=new SpringApplication(ShoppingManagementSystemApplication.class);
	      System.out.println("Spring Core Version:- " + SpringVersion.getVersion());
		
		
		SpringApplication.run(ShoppingManagementSystemApplication.class, args);
	}
@Autowired
private ShopRepository shopRepository;
	@Override
	public void run(String... args) throws Exception {
		
	/*	Shop shop1 = new Shop("Ambani", "Mukesh Ambani", "Wholesale","Open", "Ambani123@gmail.com");
		shopRepository.save(shop1);
		Shop shop2 = new Shop("Roadster Fashion", "Gautham Menon", "Wholesale","Open", "Gauthamvasudev45@gmail.com");
		shopRepository.save(shop2);
		Shop shop3 = new Shop("Fixing Tools", "Raaju Bai", "Wholesale","Close", "Raajubai22@gmail.com");
		shopRepository.save(shop3);
		Shop shop4 = new Shop("Stark Technology", "Tony Stark", "Retail","Oepn", "TonyStark0@gmail.com");
		shopRepository.save(shop4); */
			}

}
