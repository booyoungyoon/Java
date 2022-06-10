package com.ezen;

import lombok.Getter;
import lombok.Setter;

public class CarTest {

	public static void main(String[] args) {
		Sedan se = new Sedan();
		se.setColor("red");
		System.out.println(se.getColor());
		se.setPassenger(4);
		System.out.println(se.getPassenger() + "명");
		
		Sedan se2 = new Sedan("Blue", 2, 4, 3);
		System.out.println(se2.getPassenger() + "명");
		System.out.println(se.getColor());
		
		Sports sp2 = new Sports("yellow", 2, 4, 1, 5000);
		System.out.println(sp2.getColor() + "," + sp2.getPassenger() + "," + sp2.getTire() + ","
				+ sp2.getSeat() + "," + sp2.horsePower);
		sp2.run();
	}
}
@Getter
@Setter
class Car{
	private int passenger;
	private int tire;
	private int seat;
	public Car() {}
	public Car(int passenger, int tire, int seat) {
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
	}
	void run() {
		System.out.println("달료!!!!!!!!");
	}
	void stop() {}
}

class Sedan extends Car{
	
	private String color;
	
	public Sedan() {}
	public Sedan(String color, int passenger, int tire, int seat) {
		super(passenger, tire, seat);
		this.color = color;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void gas() {}
}
class Sports extends Sedan {
	int horsePower;
	public Sports() {}
	public Sports(String color, int passenger, int tire, int seat, int horsePower) {
		super(color, passenger, tire, seat);
		this.horsePower = horsePower;
	}
	void run() {
		System.out.println("스포츠카 달료!!!!!!!!");
	}
}
class Bus extends Car{
	int passengerCount;
	void passengerLoad() {}
	
}
class Truck extends Car{
	int load;
	void objectLoad() {}
}