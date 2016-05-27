package cn.ucai.day04;

/**
 * 逻辑运算符：短路运算符
 * 位运算符：长路（无论如何都会走完）
 */
public class TestLogic2 {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		if(a==2||b++==3){ // 逻辑运算符
			System.out.println("hello ");
		}
		
		System.out.println(a);// 2
		System.out.println(b);// 4
	}
}
