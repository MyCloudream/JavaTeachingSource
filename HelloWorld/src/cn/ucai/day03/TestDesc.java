package cn.ucai.day03;

import cn.ucai.tools.InputTools;
/**
 * 1������ȫСд
 * 2���������ӿ��� ����������ĸ��д 
 * 3����������������   ��һ����������ĸСд��������������ĸ��д
 */
public class TestDesc {
	public static void main(String[] args) {
//		System.out.println("����������������");
//		String name = InputTools.getInputString();
//		System.out.println("���������Ĺ��磺");
//		String from = InputTools.getInputString();
//		System.out.println("�����������س���");
//		String skill = InputTools.getInputString();
//		System.out.println("����������Java�ɼ���");
//		int javaScore = InputTools.getInputInt();
//		System.out.println("�ҽ�"+name+",����"+from+",�ó�"+skill+",java�ɼ�Ϊ��"+javaScore);
//		
		System.out.println("������Boolean����");
		String strBoolean = InputTools.getInputString();
		boolean bool = Boolean.parseBoolean(strBoolean);
		System.out.println(bool);
	}
}
