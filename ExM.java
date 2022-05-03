package classwork13;

public class ExM {

	public static void main(String[] args) {
		/*
		System.out.println("START");
		int a = 10;
		int b = 0;
		int[] arr = {1,2,0};
		try {
			System.out.println("a/b = " + a / b);
		} catch (ArithmeticException e) {
			System.out.println("Opps");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Not existing index");
		} finally {
			
		}
		MyClass myClass = new MyClass();
		SecondClass sc = new SecondClass(myClass);
		try {
			sc.adapter(5, 0);
		} catch (Exception e) {
			System.out.println("Got you Main");
		}
		
		System.out.println("END");*/
		try {
			throw new BratvaDontGetMoney();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
