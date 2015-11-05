package com.anjali.springBasics;

class FindArea {

	IShape shape;

	public void getShape() {
		shape.area();
	}

	public void setShape(IShape shape) {
		this.shape = shape;
	}
}
