package cn.ucai.day04.game;

/**
 * String�ļ���������ʹ�� 
 * ���з����������ı�String����
 */
public class TestString {
	public static void main(String[] args) {
		String s1 = "abc";
		// �ж������ַ����Ƿ����
		System.out.println(s1.equals("abc")); // true
		System.out.println("abc".equals(s1));
		System.out.println(s1.equals("abcd")); // false
		String s2 = "Y";
		// ���Դ�Сд�ıȽ�
		System.out.println(s2.equalsIgnoreCase("y"));
		
		System.out.println(s1.length());
		
		String s3 = "abcdef";
		System.out.println(s3.substring(1, 3));// �±��0��ʼ��ǰ�պ�
		System.out.println(s3.substring(3));// def
		String s4 = s3.substring(3);
		System.out.println(s4);
		System.out.println(s3);
		// trim ֻ��ȥ�����˵Ŀո�
		String s5 = " a bc ";
		System.out.println(s5.length());
		String s6 = s5.trim();
		System.out.println(s6.length());
		
		String s7 = "abc";// �ֵ�
		System.out.println(s7.compareTo("abcab"));
		
		
		String s8 = "abc";
		char ch = s8.charAt(2);
		System.out.println(ch);
	}
}
