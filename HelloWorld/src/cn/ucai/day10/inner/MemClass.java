package cn.ucai.day10.inner;
/**
 * 内部类：
 * 1、成员内部类
 * 2、静态内部类
 */
public class MemClass {
	// 属性 成员变量  实例变量
	private static int age;
	public MemClass(){
		Mem mem = new Mem();
		mem.m();
	}
	// 成员方法
	public static void method(){
		Mem mem = new Mem();
		mem.m();
	}
	
	public static void main(String[] args) {
		MemClass mc = new MemClass();
		// 不常见
		Mem mem = new Mem();
		mem.m();
	}
	
	public static class Mem{
		public void m(){
			System.out.println("我是静态内部类");
		}
	}
}