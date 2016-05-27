package cn.ucai.day06;
/**
 * F5：进入方法内部
 * F6:单步执行
 * F7：跳出当前方法
 * F8：跳到下一个断点
 */
public class TestDebug {
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		m1();
		m2();
	}
	
	public static void m1(){
		System.out.println("hello ");
		System.out.println("hello ");
		System.out.println("hello ");
		System.out.println("hello ");
		System.out.println("hello ");
		System.out.println("hello ");
	}
	
	public static void m2(){
		System.out.println("world ");
		System.out.println("world ");
		System.out.println("world ");
		System.out.println("world ");
		System.out.println("world ");
		System.out.println("world ");
	}
}
