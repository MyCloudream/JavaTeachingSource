package cn.ucai.day05;

public class TestArray2 {
	public static void main(String[] args) {
		// 数组：表示能存储固定个数个固定数据类型数据的容器
		int nums = 20;
		int[] arr = new int[nums];
		// 元素：数组中的每一个数  有默认值
		arr[0] = 93;
		arr[1] = 89;
		arr[2] = 78;
		arr[3] = 88;
		// length：属性：用于获得数组中元素的个数
		// 属性：静态特征
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		int[] arr2 = new int[]{93,94,91,88,76,92};
		int[] arr3 = {93,94,91,88,76,92};
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		
		// 新建一个长度为10的int型数组
		// 将数组元素初始化为1-10
		// 将数组元素输出：输出为一列，格式：[1,2,3,4,...10]
		
	}
}
