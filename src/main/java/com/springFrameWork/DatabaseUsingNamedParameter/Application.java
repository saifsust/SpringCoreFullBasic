package com.springFrameWork.DatabaseUsingNamedParameter;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springFrameWork/DatabaseUsingNamedParameter/beanConfig.xml");

		DetailDAO detailDAO = (DetailDAO) context.getBean("detailDAO");
		try {

			List<Detail> list = detailDAO.getDetail();

			for (Detail detail : list) {
				System.out.println(detail);
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			System.out.println(ex.getClass());
		}

		((ClassPathXmlApplicationContext) context).close();
	}

}
