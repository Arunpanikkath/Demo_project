package com.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibs.training.beans.HelloWorld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");

HelloWorld helloWorld1=context.getBean("helloWorld",HelloWorld.class);


HelloWorld helloWorld2=context.getBean("helloWorld",HelloWorld.class);

helloWorld1.sayHello();

System.out.println(helloWorld1.equals(helloWorld2));
//true because default scope of Spring bean is singleton
//can change to prototype for spring to create seperate object for each request


	}

}
