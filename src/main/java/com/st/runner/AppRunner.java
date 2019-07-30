package com.st.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.st.entity.Customer;
import com.st.entity.Item;
import com.st.repo.CustomerRepository;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class AppRunner implements ApplicationRunner{

		private static Logger log=LogManager.getLogger(AppRunner.class);
		
		@Autowired		
		private CustomerRepository crepo;		
		
		@Override
		public void run(ApplicationArguments args) throws Exception {
			System.out.println("hello");
			log.info("app runnner start");
			Item i=new Item(103, "Mobile", 12000.00);
			Item i1=new Item(104,"Book",240.00);
			Set<Item> set=new HashSet<>();
			set.add(i);
			set.add(i1);
			log.info("Item are created");
			
			Customer c=new Customer("Amit",new Date() , "CHE", set);
			log.info("item Inserted");
			
			crepo.save(c);
			log.info("Customer saved also item");
		}
}
