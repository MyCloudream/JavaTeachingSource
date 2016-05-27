package cn.ucai.day06.hw;

import java.util.Arrays;

import cn.ucai.tools.RandomTools;

/**
	生成随机密码的程序，要求：（验证码）
	密码由大写字母、小写字母、数字组成，生成6位随机密码。
	密码各位不能重复（选作）
 */
public class Test06 {
	public static void main(String[] args) {
		char[] arr = new char[62];
		for(int i=0;i<26;i++){
			arr[i] = (char)(65+i);
		}
		for(int i=0;i<26;i++){
			arr[i+26] = (char)('a'+i);
		}
		for(int i=0;i<10;i++){// 0 '0'
			arr[i+52] = (char)('0'+i);
		}
		System.out.println(Arrays.toString(arr));
		
		// 取6位
		for(int k=0;k<10;k++){
			String password = "";
			for(int i=0;i<6;i++){
				int index = RandomTools.getRandomInt(arr.length);
				password += arr[index];
			}
			System.out.println(password);
		}
	}
}
