package cn.ucai.day04.homework;

import cn.ucai.tools.InputTools;

//		����һ���ַ�������Ǵ�д��ĸ��ת��Сд��ĸ�������Сд��ĸ��ת�ɴ�д��ĸ�����������ĸ�����������
public class Test02 {
	public static void main(String[] args) {
		System.out.println("���룺");
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
