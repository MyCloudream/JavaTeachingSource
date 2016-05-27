package cn.ucai.day06;

import java.util.Arrays;

/**
 * 数组元素的默认值
 * int:0 
 * long:0
 * boolean ：false
 * char:\u4E2D   \u0000  0 
 */
public class TestArray {
	public static void main(String[] args) {
		// 动态初始化
		int[] niArr = new int[10];// niArr.length
		for(int i=0;i<niArr.length;i++){
			niArr[i] = (i+1);
		}
		// 静态初始化
		int[] niArr2 = new int[]{1,2,3,4,5,6};
		
		boolean[] boolArr = new boolean[3];
		for(int i=0;i<boolArr.length;i++){
			System.out.println(boolArr[i]);
		}
		
		char[] chArr = new char[3];
		for(int i=0;i<chArr.length;i++){
			System.out.println(chArr[i]+"A");
		}
		// 数组的格式化输出
		System.out.println(Arrays.toString(niArr));
		Arrays.sort(niArr);// 升序
		System.out.println(Arrays.toString(niArr));
		int[] niArr3 = new int[10];
		for(int i=0;i<=9;i++){
			//0-9
			niArr3[i] = niArr[9-i];
		}
		System.out.println(Arrays.toString(niArr3));
	}
}
