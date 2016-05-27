package cn.ucai.day12;

import java.util.Arrays;

/**
 * ������ʽ����Ҫ����һЩ��֤
 * String���ж�������ʽ��֧��
 */
public class TestRegex {
	public static void main(String[] args) {
		String s = "2";
		// [abc] :��ʾȡa��b��c�е����е�����1��
		System.out.println(s.matches("[a-zA-Z0-9]"));
		String str = "abc21def123mno315abc";
		String[] strArr = str.split("\\d+");
		System.out.println(Arrays.toString(strArr));
		
		String name = "____^___";
		// �û�����������ĸ�»��� ����6-8��
		if(name.matches("[0-9a-zA-Z_]{6,8}")){
			System.out.println("ע��ɹ�");
		}else{
			System.out.println("�û��������Ϲ���");
		}
		
		// ��֤�ֻ������Ƿ���ȷ��
		// 11λ ȫ������ 1��ͷ
		String pn = "28911010011";
		if(pn.matches("1{1}[0-9]{10}")){
			System.out.println("ע��ɹ�");
		}else{
			System.out.println("�ֻ����벻���Ϲ���");
		}
		
		// ��ϰ��
		// �������֤��chenjun_123@ucai.cn
		// ������ĸ�»��ߣ�����5���� @������ĸ������Ϊ2����  .  com��cn
		String email = "chenjun_123@ucai.cn";
//		String email = "cn";
		if(email.matches("\\w{5,}@{1}[0-9A-Za-z]{2,}\\.{1}(com|cn)")){
			System.out.println("������֤�ɹ�");
		}
	}
}
