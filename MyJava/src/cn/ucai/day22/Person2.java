package cn.ucai.day22;

public class Person2{
	private String name;
	private int age;
	public Person2() {
		super();
	}
	public Person2(String name, int age) throws Exception,NullPointerException{
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
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
