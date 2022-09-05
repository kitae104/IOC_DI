package javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient
{

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		
		OrderManager manager = context.getBean("orderManager", OrderManager.class);
		System.out.println("manager : " + manager);		
		manager.order();
		
		CarMaker maker = context.getBean("kiaCar", KiaMaker.class);	// @Bean에 name 없으면 메소드명으로 처리
		manager.setMaker(maker);
		manager.order();		
	}
}
