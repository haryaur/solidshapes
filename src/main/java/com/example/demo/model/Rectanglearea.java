package com.example.demo.model;

public class Rectanglearea {
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


	public int Rectanglearea() {
		return rectanglelength * rectanglebreadth;
		
	}

}
