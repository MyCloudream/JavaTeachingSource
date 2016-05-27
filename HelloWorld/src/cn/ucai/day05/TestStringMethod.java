package cn.ucai.day05;

public class TestStringMethod {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		System.out.println(s1.concat(s2));
		s1 = "";
		System.out.println(s1.isEmpty());
		s1 = s1.trim();
//		if(s1.length()==0 || s1.isEmpty() || s1.equals("") )
		
		s1 = "abcdabcab";
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.lastIndexOf("a"));
		
		System.out.println(s1.startsWith("abc"));
		System.out.println(s1.endsWith("ac"));
	}
}
