package cn.ucai.day07;

import java.util.Arrays;

public class TestStringMethod {
	public static void main(String[] args) {
		String s1 = "abcababcabc";
//		String s2 = s1.replace("b", "0");
		String s2 = s1.replaceAll("b", "0");// 支持"正则表达式"
		System.out.println(s2);
		
//		String s3 = "2016-3-10";
		String s3 = "192.168.0.1";
		String[] arr = s3.split("\\.");// 正则
		System.out.println(Arrays.toString(arr));
		
		String s4 = "ucai";
		char[] chArr = s4.toCharArray();
//		char[] chArr = myToCharArray(s4);
		System.out.println(Arrays.toString(chArr));
		
		
		
	}
	
	public static char[] myToCharArray(String s){
		char[] chArr = new char[s.length()];
		for(int i=0;i<s.length();i++){
			chArr[i] = s.charAt(i);
		}
		return chArr;
	}
}
