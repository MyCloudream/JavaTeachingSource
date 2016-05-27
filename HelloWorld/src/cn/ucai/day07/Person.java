package cn.ucai.day07;

/**
 * 描述一下整个人类的信息
 */
public class Person {
	// 人 静态的特征  属性
	String name;
	int age;
	int height;
	int weight;
	// 造人：由类造对象
	// 借助于一种特殊的方法：构造方法
	// 1、没有返回值，名字和类名一致
	// 2、用来创建对象
	public Person(){
		
	}
	// 动态行为 功能
	void speak(){
		System.out.println("说话");
	}
	
	void walk(){
		System.out.println("走路");
	}
	// 自我介绍
	void desc(){
		System.out.println("我叫"+name+"，今年"+age+"岁，身高"+height+"cm,体重"+weight+"kg");
	}
	
	public static void main(String[] args) {
		// new + 构造方法()
		Person p = new Person();
		p.name = "尚鹏";
		p.age = 20;
		p.height = 200;
		p.weight = 200;
		p.desc();
		
		Person p1 = new Person();
		p1.name = "大宇";
	}
	
}
