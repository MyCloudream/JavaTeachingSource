package cn.ucai.day04.game;

/**
 * 4、将以下两个字符串类型的价格转换为int类型，然后相加输出结果。
	String currencyPrie1="￥288";
	String currencyPrie2="￥38";
 */
public class Homework4 {
	public static void main(String[] args) {
		String s1="￥288";
		String s2="￥38";
		String s3 = "￥38888";
		// 
		String price1 = s1.substring(1,4);
		System.out.println(price1);
		String price2 = s2.substring(1,3);
		System.out.println(price2);
		
		String strPrice1 = s1.substring(1);
		String strPrice2 = s2.substring(1);
		
		int niPrice1 = Integer.parseInt(strPrice1);
		int niPrice2 = Integer.parseInt(strPrice2);
		System.out.println("相加的结果为："+(niPrice1+niPrice2));
	}
}
