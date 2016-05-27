package cn.ucai.day04.homework;

import cn.ucai.tools.InputTools;

//		输入一个字符，如果是大写字母，转成小写字母，如果是小写字母，转成大写字母，如果不是字母，不变输出。
public class Test02 {
	public static void main(String[] args) {
		System.out.println("输入：");
		char ch = InputTools.getInputChar(0);
		if(ch>='A'&&ch<='Z'){
			int ni = ch + ('a'-'A');
			System.out.println((char)ni);
		}else if(ch>='a'&&ch<='z'){
			int ni = ch - ('a'-'A');
			System.out.println((char)ni);
		}else{
			System.out.println(ch);
		}
	}
}
