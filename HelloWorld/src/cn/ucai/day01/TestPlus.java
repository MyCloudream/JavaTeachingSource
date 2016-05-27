package cn.ucai.day01;

public class TestPlus {
	// + 的用法
	public static void main(String[] args) {
		System.out.println(2+3);
		// + 还可以用于拼接字符串
		System.out.println("abc"+"def");// abcdef
		System.out.println("abc"+"123");// abc123
		// 当整数和字符串使用+拼接时，结果为字符串
		// 3+"3"+4--> "33"+4-->"334"
		System.out.println(1+2+"3"+4);// 73 334 
		// "12"+3+4-->"123"+4-->"1234"
		System.out.println("1"+2+3+4);// 1234
		// 1+2+3+"abc"+4+5+6+"def"+7+8+9
	}
}
