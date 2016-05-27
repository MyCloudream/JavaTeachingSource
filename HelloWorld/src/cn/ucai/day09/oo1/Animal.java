package cn.ucai.day09.oo1;
public class Animal {
	private String name;
	private int age ;

	public Animal(){
		
	}
	
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat(){
		System.out.println("³Ô£¿");
	}
	
	public static void m(){
		System.out.println("animal static method");
	}
}
