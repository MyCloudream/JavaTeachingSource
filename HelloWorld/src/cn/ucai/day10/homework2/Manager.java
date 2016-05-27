package cn.ucai.day10.homework2;

public class Manager extends Person {
	private String mno;
	private double sal;
	public Manager() {
		super();
	}
	public Manager(String name, int age,String mno,double sal) {
		super(name, age);
		this.mno = mno;
		this.sal = sal;
	}
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
}
