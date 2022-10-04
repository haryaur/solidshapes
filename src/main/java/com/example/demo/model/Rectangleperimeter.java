package com.example.demo.model;

public class Rectangleperimeter {
	private int rectanglelength;
	private int rectanglebreadth;
	
	
	public int getrectanglelength() {
		return rectanglelength;
	}


	public void setrectanglelength(int rectanglelength) {
		this.rectanglelength = rectanglelength;
	}


	public int getrectanglebreadth() {
		return rectanglebreadth;
	}


	public void setrectanglebreadth(int rectanglebreadth) {
		this.rectanglebreadth = rectanglebreadth;
	}


	public int Rectangleperimeter() {
		return (2*(rectanglelength + rectanglebreadth));
		
	}

}
