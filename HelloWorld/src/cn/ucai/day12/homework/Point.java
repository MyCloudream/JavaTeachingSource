package cn.ucai.day12.homework;

public class Point {
	private int x;
	private int y;
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getDis(Point point){
		double d = Math.sqrt(Math.pow(this.getX()-point.getX(),2)+Math.pow(this.getY()-point.getY(),2));
		return (int)d;
	}
}
