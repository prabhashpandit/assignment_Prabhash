package com.prabhash.shape;

public class Cylinder extends shape3D {
	private int radius ,height;

	
	public void setCylinder(int radius, int height) {
		this.radius=radius;
		this.height=height;
	}
	public double volume() {
		return 3.14*(double)(radius*radius*height);
	}

	public double surfaceArea() {
		return (double)(2*(2*3.14*radius*height));
		
	}
}
