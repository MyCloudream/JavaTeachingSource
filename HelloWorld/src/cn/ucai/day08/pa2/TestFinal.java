package cn.ucai.day08.pa2;

/**
 * final:最终的 
 * 1、可以修饰方法 表示这个方法不能被重写
 * 2、如果一个类中所有的方法都不想被重写，可以final来修饰类 表示该类不能被继承
 * 3、final修饰属性，表示该属性不能被改变（必须有一个值）
 * 		有三种赋值方式：直接赋值 语句块赋值 构造方法赋值
 * 	 static 和final同时修饰的属性：这种称为不可变的变量（常量）
 * 		有两种赋值方式：直接赋值和静态语句块赋值
 *   不可变变量的命名规则；
 *   所有单词全大写，单词之间使用_拼接
 * 4、fianl修饰局部变量:final 是唯一一个可以修饰局部变量的修饰符
 * 	使用在内部类的情况。
 */
public class TestFinal {
	public static void main(String[] args) {
		final int a = 2;
	}
}


