package com.anjali.springBasics;

public class Circle implements IShape{
	int r;
	
	public Circle(int r){
		this.r = r;
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Circle :"+ 3.14*r*r);
	}

}
