package cn.ucai.day08;

/**
 * static：静态的 类的  为所有对象共享的 
 * 1、static可以修饰方法
 * 2、修饰属性
 * 3、修饰静态语句块
 * 4、修饰内部类
 * 程序运行：
 * 启动虚拟机--类加载到内存中--运行   类只加载一次（静态语句块运行一次） 
 * static 在类加载的时候完成初始化
 * 一般的属性和方法，在运行时候才完成初始化
 */
public class TestStatic {
	static int age;
	int age2;
	
	public static void main(String[] args) {
		System.out.println(age);
		m();
	}
	
	public static void m(){
		System.out.println("static method ");
	}
	
	public void m1(){
		System.out.println("static method ");
		System.out.println(age);
		System.out.println(age2);
	}
}
