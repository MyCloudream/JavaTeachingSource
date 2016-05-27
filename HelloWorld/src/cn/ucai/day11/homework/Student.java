package cn.ucai.day11.homework;

public class Student {
	private String sno;
	private String name;
	private String gender;
	public Student() {
		super();
	}
	public Student(String sno, String name, String gender) {
		super();
		this.sno = sno;
		this.name = name;
		this.gender = gender;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
}
