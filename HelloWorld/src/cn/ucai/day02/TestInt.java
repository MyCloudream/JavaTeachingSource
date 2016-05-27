package cn.ucai.day02;

public class TestInt {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		int c = a;
		a = b;
		b = c;
		System.out.println("a的值为："+a);
		System.out.println("b的值为："+b);
		
		// 不借第三个变量的交换
		a = a+b; // a=5
		b = a-b; // b=5-3 b=2
		a = a-b; // a=5-2 a=3
		System.out.println(a);
		System.out.println(b);
	}
}
