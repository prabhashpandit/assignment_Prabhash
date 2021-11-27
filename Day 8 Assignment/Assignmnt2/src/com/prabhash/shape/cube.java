package com.prabhash.shape;

public class Cube extends shape3D {
	double side,area,volume;
	public void surfacearea(side) {
		System.out.println("Surfacearea ");
		area=6*side*side;
		
	}
	public void volume ()
	{
		System.out.println("volume ");
		volume=side*side*side;
	}
}



