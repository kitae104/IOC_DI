package interfaces;

/**
 * 돈을 관리하는 클래스
 * @author 김기태
 *
 */
public class Money
{
	private int amount;

	public Money() {
		super();
	}

	public Money(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
