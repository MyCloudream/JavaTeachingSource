package cn.ucai.day10;

import java.math.BigDecimal;

/**
 * BigDecimal
 * 1、用于精确计算
 * 2、用于超大数的计算
 */
public class TestBigData {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		double d1 = bd1.add(bd2).doubleValue();
		System.out.println(d1);
		BigDecimal bd3 = new BigDecimal(Double.MAX_VALUE);
		BigDecimal bd4 = new BigDecimal(Double.MAX_VALUE);
		System.out.println(bd3.add(bd4));
		// 乘法 除法 减法
		System.out.println(bd3.divide(bd4));
		System.out.println(bd3.multiply(bd4));
		System.out.println(bd3.subtract(bd4));
		
		BigDecimal bd5 = new BigDecimal("2");
		BigDecimal bd6 = new BigDecimal("3");
		System.out.println(bd5.divide(bd6,2,BigDecimal.ROUND_HALF_UP));
	}
}
