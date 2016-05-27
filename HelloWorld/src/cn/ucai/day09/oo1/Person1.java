package cn.ucai.day09.oo1;
/**
 * 静态和一般属性/方法调用规则：
 * 静态方法只能调用静态属性或方法
 * 一般方法（成员方法） 能调用一般方法，也能调用静态方法
 * 
 * 启动JVM--加载到内存中（类加载）--程序运行
 * static 在类加载的时候确定
 */
public class Person1 {
	static int a;// 属于整个类的  所有对象共享的
 	int age;// 一般属性，每一个对象拥有自己的该属性
	public Person1(){
		a++;
		age++;
	}
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		System.out.println(p1.a);// 1
		System.out.println(p1.age);// 1
		Person1 p2 = new Person1();
		System.out.println(p2.a);// 2
		System.out.println(p1.a);// 2
		System.out.println(p2.age);// 1
		
		Person1 p3 = new Person1();
		System.out.println(p3.age);// 1
		System.out.println(p3.a);// 3
	}
}
