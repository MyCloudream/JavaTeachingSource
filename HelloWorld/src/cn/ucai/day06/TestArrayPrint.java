package cn.ucai.day06;

import java.util.Arrays;

public class TestArrayPrint {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		
		int[][] arr2 = {
				{1,2,3},
				{2,3,4,5}
		};
		
		for(int i=0;i<arr2.length;i++){
			/*for(int j=0;j<arr2[i].length;j++){
				System.out.println(arr2[i][j]);
			}*/
			System.out.println(Arrays.toString(arr2[i]));
		}
		
		System.out.println(Arrays.toString(arr2));
	}
}
