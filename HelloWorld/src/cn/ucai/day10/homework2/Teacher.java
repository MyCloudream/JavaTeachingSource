package cn.ucai.day10.homework2;

public class Teacher extends Person {
	private String tno;
	private double sal;
	public Teacher() {
		super();
	}
	public Teacher(String name, int age,String tno,double sal) {
		super(name, age);
		this.tno = tno;
		this.sal = sal;
	}
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
