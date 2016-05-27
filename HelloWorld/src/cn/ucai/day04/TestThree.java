package cn.ucai.day04;
/**
 * java中的三目运算符 
 */
public class TestThree {
	public static void main(String[] args) {
		int a = 24;
		String s = a>0?"正数":"负数";
		boolean b = a>0?true:false;
		System.out.println(s);
		System.out.println(b);
		int age = a>0?a:21;
		System.out.println(age);
		System.out.println(-3%2);// 
		String r = a%2==0?"偶数":"奇数";
		System.out.println(r);
		
	}
}
