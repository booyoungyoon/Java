package com.practice.model.entity;

public class Circle extends Point{
	private int radius;
	
	public Circle() {}
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius=radius;
	}
	public void draw() {
		System.out.println("원면적 : " + Math.PI * radius * radius);
		System.out.println("원둘레 : " + 2*Math.PI*radius);
	}
}
