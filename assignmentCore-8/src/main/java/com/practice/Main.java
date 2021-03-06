package com.practice;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	   public static void main(String[] args) {
	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      context.registerShutdownHook();
	   }
	}
