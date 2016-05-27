package cn.ucai.day08.p1;

public class TestInteger {
	public static void main(String[] args) {
	// -128~127
		Integer i1 = 128;// 5.0  自动装箱
//		Integer i2 = new Integer(2);
		Integer i2 = 128;
		int i3 = i1+i2;// 自动解箱
		
		Integer i4 = new Integer(2);
		Integer i5 = new Integer(2);
		System.out.println(i1==i2);
		
		System.out.println(i4==i5);
		
		Integer i6 = 2;
		int i7 = 2;
		// 当包装类对应基本类==比较的时候，先转为基本类，再比较
		System.out.println(i6==i7);
		
	}
}
