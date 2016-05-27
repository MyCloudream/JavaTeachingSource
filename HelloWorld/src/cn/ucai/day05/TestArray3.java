package cn.ucai.day05;

import java.util.Arrays;

public class TestArray3 {
	public static void main(String[] args) {
		// 新建一个长度为10的int型数组
		// 将数组元素初始化为1-10
		// 将数组元素输出：输出为一列，格式：[1,2,3,4,...10]
//		int[] niArr = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] niArr = new int[10];
		for(int i=0;i<10;i++){
			niArr[i] = i+1;
		}
		
		System.out.print("[");
		for(int i=0;i<10;i++){
			if(i==9){
				System.out.print(niArr[i]);
			}else{
				System.out.print(niArr[i]+",");
			}
		}
		System.out.print("]");
		System.out.println();
		// Arrays:里面提供了数组操作相关方法的工具类
		System.out.println(Arrays.toString(niArr));
	}
}
