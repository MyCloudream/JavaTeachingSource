package cn.ucai.day07.p2;

public class Person {
	String name;
	int age;
	int height;
	int weight;
	Dog dog;
	Person son;
	public Person(){
		
	}
	
	public Person(String name,int age,int height,int weight,Dog dog,Person child){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.dog = dog;
		this.son = child;
	}
	
	// 自我介绍
	void desc(){
		System.out.println("我叫"+name+"，今年"+age+"岁，身高"+height+"cm,体重"+weight+"kg");
	}
}
