package cn.ucai.day12.homework;

public class Circle {
	private Point p;
	private int r;

	public Circle() {
		super();
	}
	
	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}

	public double getS(){
		return 2*Math.PI*r;
	}
	
	public double getV(){
		return Math.PI*r*r;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
}
