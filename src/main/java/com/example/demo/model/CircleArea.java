package com.example.demo.model;

import java.util.Formatter;

public class CircleArea {
		private double circleradius;

		

		public double getCircleradius() {
			return circleradius;
		}

		public void setCircleradius(double circleradius) {
			this.circleradius = circleradius;
		}

		public String CircleArea() {
			double d = (3.1415926535897932383 * (Math.pow(circleradius,2)));
			Formatter formatter = new Formatter();
			formatter.format("%.2f", d);
			return formatter.toString();		
		}
	}

