package cn.ucai.day04.game;

/**
 * String的几个方法的使用 
 * 所有方法，都不改变String本身
 */
public class TestString {
	public static void main(String[] args) {
		String s1 = "abc";
		// 判断两个字符串是否相等
		System.out.println(s1.equals("abc")); // true
		System.out.println("abc".equals(s1));
		System.out.println(s1.equals("abcd")); // false
		String s2 = "Y";
		// 忽略大小写的比较
		System.out.println(s2.equalsIgnoreCase("y"));
		
		System.out.println(s1.length());
		
		String s3 = "abcdef";
		System.out.println(s3.substring(1, 3));// 下标从0开始，前闭后开
		System.out.println(s3.substring(3));// def
		String s4 = s3.substring(3);
		System.out.println(s4);
		System.out.println(s3);
		// trim 只能去掉两端的空格
		String s5 = " a bc ";
		System.out.println(s5.length());
		String s6 = s5.trim();
		System.out.println(s6.length());
		
		String s7 = "abc";// 字典
		System.out.println(s7.compareTo("abcab"));
		
		
		String s8 = "abc";
		char ch = s8.charAt(2);
		System.out.println(ch);
	}
}
