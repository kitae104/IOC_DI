package annotation;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderManager
{
	@Inject
	@Named("hyundai")
	private CarMaker maker;

	@Autowired
	public OrderManager(@Qualifier("hyundai") CarMaker maker) {
		super();
		this.maker = maker;
	}
	
	public void setMaker(CarMaker maker)
	{
		this.maker = maker;
	}
	
	public void order() {
		// 돈 준비 
		Money money = new Money(1000);
		System.out.println("판매상 : ((비용)) " + money.getAmount());
		System.out.println("판매상 : ((지불)) " + money.getAmount());
		
		// 차 구매 
		Car car = maker.sell(money);
		System.out.println("판매상 : ((인수)) " + car.getName() );
	}

	
}
