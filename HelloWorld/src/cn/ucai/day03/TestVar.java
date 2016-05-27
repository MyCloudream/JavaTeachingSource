package cn.ucai.day03;

/**
 * 变量的作用范围：所在的大括号
 * @author sks
 *
 */
public class TestVar {
	public static void main(String[] args) {
		System.out.println("hello world !");
		String name = "张三";
		{// 语句块
			System.out.println("hello world 2 ");
			System.out.println(name);
			System.out.println("3");
		}
		System.out.println(name);
	}
}
