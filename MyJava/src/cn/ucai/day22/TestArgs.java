package cn.ucai.day22;

import java.util.Arrays;

public class TestArgs {
	public static void main(String[] args) {
		m(1);
		m(1,2);
		m(1,2,3,4,5,6);
		m(new int[]{1,2,3,4});
		
		int[] arr = new int[]{};
		System.out.println(Arrays.toString(arr));
	}
	
	public static void m(int... arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
//		System.out.println(sum);
	}
}
