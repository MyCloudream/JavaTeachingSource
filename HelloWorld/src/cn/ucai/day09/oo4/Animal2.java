package cn.ucai.day09.oo4;
/**
 * 如果一个类中有抽象方法，则该类必须也声明为抽象类
 * 有构造方法 但是不能创建对象
 * 有main方法
 * abstract 不和private static final 共同修饰
 */
public abstract class Animal2 {
	public Animal2(){// 有构造方法
		super();
	}
	
	public abstract void eat();
	
	public void methodAnimal(){
		System.out.println("methodAnimal");
		eat();
	}
	
	public static void main(String[] args) {
		Animal2 a = new Dog();
		a.eat();
	}
}
