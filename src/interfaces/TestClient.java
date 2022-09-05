package interfaces;

public class TestClient
{

	public static void main(String[] args)
	{
		OrderManager manager = new OrderManager();
		
		CarMaker maker = new HyundaiMaker();		
		manager.setMaker(maker);	// 주입 하는 방식 
		
		manager.order();
	}
}
