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
	
	// ���ҽ���
	void desc(){
		System.out.println("�ҽ�"+name+"������"+age+"�꣬���"+height+"cm,����"+weight+"kg");
	}
}
