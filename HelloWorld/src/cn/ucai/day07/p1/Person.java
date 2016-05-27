package cn.ucai.day07.p1;

/**
 * 构造方法：
 * 如果没有主动提供任何构造方法，类自动给提供一个无参构造方法
 * 如果提供了构造方法，则默认的无参不再提供
 * 
 * 构造方法的重载：
 * 方法名相同，方法参数不同
 * 
 * 构造方法的相互调用
 * 使用this(..)表示对本类其他构造方法的调用
 * 注意避免死循环
 * this:表示本类对象
 * this. 调用本对象的属性
 */
public class Person {
	String name;
	int age;// 属性 默认初始化
	int height;
	int weight;
	// 无参构造
	public Person(){
		
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	// 全参构造
	public Person(String name,int age,int height,int weight){
		this(name,age);
		this.height = height;
		this.weight = weight;
	}
	
	// 自我介绍
	void desc(){
		System.out.println("我叫"+name+"，今年"+age+"岁，身高"+height+"cm,体重"+weight+"kg");
	}
	
	public static void main(String[] args) {
		Person p = new Person("苏江",22,220,180);
		p.desc();
		
		Person p2 = new Person();
	}
	
}
