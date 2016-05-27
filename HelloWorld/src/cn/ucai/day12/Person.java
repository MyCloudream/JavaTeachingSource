package cn.ucai.day12;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age)/* throws AgeException*/{
		if(age<0){
			throw new AgeException("年龄不能为负数");
//			System.out.println("hello");
		}
		this.age = age;
	}
	
}
