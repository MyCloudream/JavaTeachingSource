package cn.ucai.day10;

import java.util.Arrays;

/**
 * System.arraycopy():数组拷贝
 * src:源数组
 * srcPos：源数组的开始位置
 * dest：目标数组
 * destPos：目标数组的开始位置
 * length：要拷贝的数据的个数
 */
public class TestArrayCopy {
	public static void main(String[] args) {
		int[] niArrSrc = {7,2,1,5,3,9,6,8};// 静态初始化
		int[] niArrDest = new int[10];// 动态初始化
		// 将源数组中的元素，从0开始拷贝到目标数组的下标为0的位置，拷贝8个元素
		System.arraycopy(niArrSrc, 0, niArrDest, 0, 8);
		System.out.println(Arrays.toString(niArrDest));
		// 下标为2到下标为7之间的数排序
		Arrays.sort(niArrSrc,2,7); // [) 
		// Arrays.sort改变的是源数组
		System.out.println(Arrays.toString(niArrSrc));
		
	}
	
	/*public static void m(){
		System.out.println("hello");
	}*/
}
