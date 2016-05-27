package cn.ucai.day10;

/**
 * StringBuilder/StringBuffer
 * 1、单线程/多线程
 */
public class TestString2 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = "mno";
		// "abc" "def" "mno" "abcdef" "abcdefmno"
		String s4 = s1+s2+s3;
		
		// StringBuilder/StringBuffer
		
		StringBuilder builder = new StringBuilder();
		/*builder.append("abc");
		builder.append(true);
		builder.append(2);*/
		builder.append("abc").append("def").append(true).append(2);
		
		String s5 = builder.toString();
		System.out.println(s5);
	}
	
}
