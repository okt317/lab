package more;

public class Car {
	
	String y = "야";
	
	public static void main(String[] args) {
		Car b = null;
		b = new Car();
		System.out.println(b.y);
		b.y = "di";
		System.out.println(b.y);

	}

}
