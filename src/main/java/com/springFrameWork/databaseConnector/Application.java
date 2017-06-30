package com.springFrameWork.databaseConnector;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springFrameWork/databaseConnector/beanConfig.xml");
		infoDAO inf = (infoDAO) context.getBean("infoDao");

		try {
			List<info> list = inf.getInfo();
			for (info in : list) {
				System.out.println(in);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			//System.out.println(ex.getClass());
			System.out.println(ex.getCause());
		}

		((ClassPathXmlApplicationContext) context).close();

	}

}
