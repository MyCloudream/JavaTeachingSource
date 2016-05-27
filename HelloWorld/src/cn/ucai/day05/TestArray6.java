package cn.ucai.day05;

import java.util.Arrays;

public class TestArray6 {
	public static void main(String[] args) {
		// 基本數據類型 引用數據類型
		// new：
		int[] niArr = {2,4,1,7,9};
		int[] niArr2 = new int[5];
		/*for(int i=0;i<niArr.length;i++){
			niArr2[i] = niArr[i];
		}*/
		
		niArr2 = niArr;
//		niArr2[1] = 8;
		niArr[1] = 8;
		System.out.println(Arrays.toString(niArr));
		System.out.println(Arrays.toString(niArr2));
		
		
		
		
	}
}
