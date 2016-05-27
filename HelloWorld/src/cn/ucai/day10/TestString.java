package cn.ucai.day10;
/**
 * 1、compareTo：两种情况
 */
public class TestString {
	public static void main(String[] args) {
		/*String s1 = "abc";
		String s2 = "abcdefghi";
		System.out.println(s1.compareTo(s2));*/
		// 字符串常量池
		String s1 = "abc";
		
		String s2 = "abc";
		
		String s3 = new String("abc");
		
		String s4 = new String("abc");
		
		/*System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);*/
		
		System.out.println(s3==s4);// false
		
		System.out.println(s3.intern()==s4.intern());
	}
}
