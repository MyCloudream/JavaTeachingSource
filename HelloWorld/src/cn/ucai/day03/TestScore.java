package cn.ucai.day03;

import cn.ucai.tools.InputTools;

/**
 *  �Ƚ��������
 *  >= > < <= 
 *  == ���� 
 *  != ������
 */
public class TestScore {
	public static void main(String[] args) {
		System.out.println("������ɼ���");
		int score = InputTools.getInputInt();
		// ���ʽ ���
		if(score>=90){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
	}
}
