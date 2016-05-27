package cn.ucai.day06;

import java.util.Arrays;

public class TestArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8};
		
		int[] arr2 = new int[8];
		for(int i=0;i<4;i++){
			arr2[i] = arr1[i+2];
		}
		System.out.println(Arrays.toString(arr2));
		
		// 1¡¢Arrays
		
		int[] arr3 = Arrays.copyOf(arr1, 8);
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = Arrays.copyOfRange(arr1, 2, 6);
		System.out.println(Arrays.toString(arr4));
		
		// 2¡¢System arraycopy·½·¨
		
		
	}
}
