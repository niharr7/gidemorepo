package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Client {
	//public static void main(String[] args) {
		
		public void dsplay(){
		 ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		 HelloWorld w= (HelloWorld)context.getBean("helloBean");
		 w.printHello(); 
		 
		/* Resource resource=new ClassPathResource("Beans.xml");
		 BeanFactory factory=new XmlBeanFactory(resource);
		 factory.getBean("helloBean");*/
		 
		 
	}

}
