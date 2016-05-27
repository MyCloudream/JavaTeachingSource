package cn.ucai.day09.oo2;

/**
 * static ：
 * 1、属性、方法
 * 2、语句块：静态语句块
 * 
 * final：最终的 最后的
 * 1、修饰属性：表示该属性必须要有值 三种赋值方式
 * 2、static final同时修饰属性：有两种赋值方式
 * 3、static final ：不可变的变量（常量）
 * 
 * 修饰方法 
 * 修饰某方法，表示该方法不能被重写
 * 修饰类：表示该类不能被继承（所有方法不能 被重写的）
 * 
 */
public class Person {
	private static final int MAX_AGE = 10;
	private static final int b;
	static{
		b = 10;
	}
	/*private static final int c;
	public Person(int c){
		this.c = c;
	}*/
	public static void main(String[] args) {
		System.out.println(Math.PI);
	}
}
