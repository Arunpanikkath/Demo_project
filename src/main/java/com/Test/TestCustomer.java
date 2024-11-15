package com.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibs.training.beans.Customer;
import com.ibs.training.beans.HelloWorld;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-config2.xml");
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-autowire.xml");

Customer customer=context.getBean("customer",Customer.class);

customer.enrol();

Customer customer1=context.getBean("customer1",Customer.class);

customer1.enrol();
	}

}
