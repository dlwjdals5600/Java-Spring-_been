package iaccess.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import iaccess.di.entity.Hello;
import iaccess.di.ui.ColorPrinter;
import iaccess.di.ui.MonoPrinter;
import iaccess.di.ui.Printer;

public class DiExam {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ApplicationContext context= new GenericXmlApplicationContext("iaccess/di/test/config.xml");
		
		
		//Hello hello = (Hello)context.getBean("hello");
		Hello hello = context.getBean(Hello.class);
		//Hello hello = context.getBean("hello",Hello.class);
		
//		Integer i = 1234;
//		String a="dddd";
//		
//		System.out.println(a.getClass());

		
		hello.print("hello");

		String[] beans = context.getBeanDefinitionNames();
		
		for(String sadas :beans) {
			System.out.println(sadas);
		}

	}

}