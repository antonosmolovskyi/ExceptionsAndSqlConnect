package classwork13;

public class BratvaDontGetMoney extends RuntimeException {
	private final static String MESSAGE = "I have kalashnikow, go away";
	
	public BratvaDontGetMoney() {
		super(MESSAGE);
	}
}
