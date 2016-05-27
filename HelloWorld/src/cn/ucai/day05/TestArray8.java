package cn.ucai.day05;

import java.util.Arrays;

/**
 * Arrays中的其他方法
 */
public class TestArray8 {
	public static void main(String[] args) {
		int[] niArr = new int[10];
		for(int i=0;i<10;i++){
			niArr[i] = /*RandomTools.getRandomInt(100)*/ i+10;
			
		}
		
		System.out.println(Arrays.toString(niArr));
//		Arrays.sort(niArr);
//		System.out.println(Arrays.toString(niArr));
		System.out.println(Arrays.binarySearch(niArr, 15));
		
	}
}
