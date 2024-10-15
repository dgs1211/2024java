package ch06Main;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Hyundai", "Sonata", 100, 0);
		Car car2 = new Car("Bents", "S100", 200, 0);
		Car car3 = new Car();
		
		car1.ShowInfo();
		car2.ShowInfo();
		car3.ShowInfo();
	}

}
