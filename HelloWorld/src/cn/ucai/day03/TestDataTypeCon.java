package cn.ucai.day03;

/**
 * 数据类型之间的转换
 * 1、自动转换
 * a、byte short int long float double   -->
 * b、char-->int 
 * c、表示数范围内
 * 
 * 2、手动（强制）转换  
 * 
 */
public class TestDataTypeCon {
	public static void main(String[] args) {
		byte b1 = 127;
		short s1 = b1;
		int i1 = b1;
		
		char ch1 = '中';
		int i2 = ch1;
		System.out.println(i2);
		
		int a = 3;
		byte b = (byte)a;
		System.out.println(b);
		
		int c = 20013;
		char ch2 = (char)c;
		System.out.println(ch2);
		
		byte by1 = 2;
		byte by2 = 3;
		// 运算规则：所有小于int的运算，都是先转为int，再运算
		byte by3 = (byte)(by1 + by2);
		
		double d1 = 2.0;
		int i3 = 2;
		// 小的和大的运算，先转为大的，再运算
		int i4 = (int)(i3+d1);
		System.out.println(i4);
		
	}
}
