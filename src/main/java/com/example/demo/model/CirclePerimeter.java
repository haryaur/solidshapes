package com.example.demo.model;

import java.util.Formatter;

public class CirclePerimeter {
	private double circleradius;

	

	public double getCircleradius() {
		return circleradius;
	}

	public void setCircleradius(double circleradius) {
		this.circleradius = circleradius;
	}

	public String CirclePerimeter() {
		double d = (2 * 3.1415926535897932383 * circleradius);
		Formatter formatter = new Formatter();
		formatter.format("%.2f", d);
		return formatter.toString();
		
	}

}
