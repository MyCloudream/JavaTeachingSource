package cn.ucai.day07.p5;

public class Person {
	private String name;
	private int age;
	private Dog dog;
	private Person per;
	public Person(){
		
	}
	
	public Person(String name,int age,Dog dog){
		this.name = name;
		this.age = age;
		this.dog = dog;
	}
	
	public Person(String name,int age,Dog dog,Person per){
		this.name = name;
		this.age = age;
		this.dog = dog;
		this.per = per;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Dog getDog(){
		return this.dog;
	}
	
	public void setDog(Dog dog){
		this.dog = dog;
	}

	public Person getPer() {
		return per;
	}

	public void setPer(Person per) {
		this.per = per;
	}
	
}

