package cn.ucai.day08.pa3;

/**
 * 快捷键：
 * 
 */
public class Person {
	// 类的 是所有对象共享的
	static int a = 0;
	int b = 0;
	public Person(){
		a++;
		b++;
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.a);// 1
		Person p2 = new Person();
		System.out.println(p2.a);// 2
		System.out.println(p1.a);// 
		Person p3 = new Person();
		Person p4 = new Person();
		System.out.println(p1.a);// 4
		System.out.println(p2.a);// 4
		System.out.println(p3.a);// 4
		System.out.println(p4.a);// 4
		System.out.println(p1.b);// 1
		System.out.println(p2.b);// 1
		System.out.println(p3.b);// 1
		System.out.println(p4.b);// 1
	}
}
