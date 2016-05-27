package cn.ucai.day04.game;

/**
1、输入一个字符串，例如“好想有个女朋友啊”,打印如下字符图形
口好想有个女朋友啊
口口好想有个女朋友啊
口口口好想有个女朋友啊
 */
public class Homework1 {
	public static void main(String[] args) {
		String str = "好想有个女朋友啊";
		int len = str.length();
		for(int i=0;i<str.length();i++){
			for(int j=0;j<i;j++){
				System.out.print("    ");
			}
			System.out.println(str.substring(i));
		}
		
		for(int i=0;i<len;i++){
			str = "口"+str;
			System.out.println(str.substring(1, len+1));
		}
	}
}
