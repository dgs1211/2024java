package ch06Main;

public class Car {
	String company;
	String model;
	
	int maxSpeed;
	int speed ;
	
	Car(String company, String model, int maxSpeed, int speed){
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
	Car(){
		company = "";
		model = "";
		maxSpeed = 0;
		speed = 0;
	}
	
	void ShowInfo()
	{
		System.out.println("Company : " + company);
		System.out.println("Model : " + model);
		System.out.println("Max Speed : " + maxSpeed);
		System.out.println("Speed : " + speed);
	}

}
