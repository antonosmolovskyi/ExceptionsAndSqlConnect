package classwork13;

public class SecondClass {
	MyClass myClass;

	public SecondClass(MyClass myClass) {
		this.myClass = myClass;
	}
	
	public void adapter(int a, int b) throws ArithmeticException {
		try {
			myClass.someMethod(a, b);
		} catch (Exception e) {
			System.out.println("Got you second");
		}
		
	}
	
}
