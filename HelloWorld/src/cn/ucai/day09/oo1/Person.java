package cn.ucai.day09.oo1;
/**
 * 静态和一般属性/方法调用规则：
 * 静态方法只能调用静态属性或方法
 * 一般方法（成员方法） 能调用一般方法，也能调用静态方法
 * 
 * 启动JVM--加载到内存中（类加载）--程序运行
 * static 在类加载的时候确定
 */
public class Person {
	public static void main(String[] args) {
//		m();
		Person p = null;
		Person.m();
	}
	
	public static void m(){
		System.out.println("static");
	}
	
	public void m2(){
		
	}
}

class T{
	public static void main(String[] args) {
		// 静态方法：
		Person.m();
		
		Person p = new Person();
		// The static method m() from the type Person should be accessed in a static way
		p.m();
	}
}