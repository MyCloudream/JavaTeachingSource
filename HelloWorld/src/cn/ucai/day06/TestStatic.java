package cn.ucai.day06;
/**
 * static ：静态的
 * 1、修饰方法
 * 在静态方法中，只能直接调用静态方法
 * 在一般方法中，能调用一般方法，也能调用静态方法
 * 2、修饰全局变量
 * 在一般方法中，能调用static修饰的全局变量，也能调用一般变量
 * 在静态方法中，只能调用static修饰的全局变量
 */
public class TestStatic {
	static int a = 2;
	public static void main(String[] args) {
		method();
		System.out.println(a);
//		method2();
	}
	
	public static void method(){
		System.out.println("static method ");
//		method3();
	}
	
	public void method2(){
		System.out.println("!static method ");
		method3();
		method();
	}
	
	public void method3(){
		System.out.println(a);
		System.out.println("!static method ");
	}
	
}
