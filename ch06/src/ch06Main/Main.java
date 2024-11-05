package ch06Main;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Hyundai", "Sonata", 100, 0);
		Car car2 = new Car("Bents", "S100", 200, 0);
		Car car3 = new Car();
		
		
		
		System.out.println("car1");
		car1.ShowInfo();
		System.out.println("");
		System.out.println("car2");
		car2.ShowInfo();
		System.out.println("");
		System.out.println("car3");
		car3.ShowInfo();
	}

}
