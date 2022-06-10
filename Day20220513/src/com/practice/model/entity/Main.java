package com.practice.model.entity;

public class Main {

	public static void main(String[] args) {
		Circle[] circleArr = new Circle[3];
		Rectangle[] rectangleArr = new Rectangle[3];
		
		circleArr[0] = new Circle(2,2,2);
		circleArr[1] = new Circle(3,3,3);
		circleArr[2] = new Circle(4,4,4);
		for(Circle c : circleArr) {
			System.out.println(c);
		}
		for(Rectangle r : rectangleArr) {
			System.out.println(r);
		}
		Point[] p = new Point[5];
		
	}

}
