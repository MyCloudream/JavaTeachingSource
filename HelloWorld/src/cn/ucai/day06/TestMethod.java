package cn.ucai.day06;
/**
 * 方法的重载（overload）：
 * 1、方法名相同、方法的参数不同    （方法的签名）
 * 练习：定义重载的add方法，完成：
 * 两个int的相加，int和String的相加，String和int的相加，int和double类型的相加，三个int的相加
 */
public class TestMethod {
	public static void main(String[] args) {
		int[] arr = {3,4,1,5,7};
		toString(arr);
		boolean[] arr2 = {false,true,false};
		toString(arr2);
		String[] strArr = {"a","b","c"};
		toString(strArr);
	}
	// A 
	public static void toString(int[] arr){
		String result = "";
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				result += arr[i];
			}else{
				result += arr[i]+", ";
			}
		}
		result = "["+result+"]";
		System.out.println(result);
	}
	// Arrays  toString();
	public static void toString(boolean[] arr){
		String result = "";
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				result += arr[i];
			}else{
				result += arr[i]+", ";
			}
		}
		result = "["+result+"]";
		System.out.println(result);
	}
	
	public static void toString(String[] arr){
		String result = "";
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				result += arr[i];
			}else{
				result += arr[i]+", ";
			}
		}
		result = "["+result+"]";
		System.out.println(result);
	}
}
