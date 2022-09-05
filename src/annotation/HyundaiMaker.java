package annotation;

import org.springframework.stereotype.Component;

@Component("hyundai")
public class HyundaiMaker implements CarMaker
{
	@Override	
	public Car sell(Money money) {
		System.out.println("현대자동차 : (수금) " + money.getAmount());
		
		Car car = new Car("쏘나타");
		System.out.println("현대자동차 : (생산) " + car.getName());
		System.out.println("현대자동차 : (판매) " + car.getName());
		
		return car;
	}
}
