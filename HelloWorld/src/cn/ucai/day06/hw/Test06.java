package cn.ucai.day06.hw;

import java.util.Arrays;

import cn.ucai.tools.RandomTools;

/**
	�����������ĳ���Ҫ�󣺣���֤�룩
	�����ɴ�д��ĸ��Сд��ĸ��������ɣ�����6λ������롣
	�����λ�����ظ���ѡ����
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
		
		// ȡ6λ
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
