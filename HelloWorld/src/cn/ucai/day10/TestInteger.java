package cn.ucai.day10;

public class TestInteger {
	public static void main(String[] args) {
		// 1、String转int
		String age = "23";
		int niAge = Integer.parseInt(age);
		System.out.println(niAge+1);
		
		// 转2、8、16进制
		int a = 10;// 8+2  1010  12
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
		// JDK5.0  自动装箱
		Integer i1 = 1;// 构造没用了
		Integer i2 = 2;
		int i3 = i1+i2;// （自动解箱）
		System.out.println(i3);
		
		// Integer int 使用==比较 :先转int，再按照int比较
		
		Integer i4 = 2;
		int i5 = 2;
		System.out.println(i4==i5);
	}
}
