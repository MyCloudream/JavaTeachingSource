package cn.ucai.day03;

import cn.ucai.tools.InputTools;

/**
 * ��֧���
 * switch:ѡ�� ����
 */
public class TestSwitch {
	public static void main(String[] args) {
		System.out.println("���������ĳɼ���");
		int score = InputTools.getInputInt();
		switch (score) {// score��������    byte short char int ö�٣�5.0�� String��7.0�� 
		case 5:
			System.out.println("����");// switch�Ĵ�͸����
			break;
		case 4:
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break;
		case 2:
			System.out.println("������");
			break;
		case 1:
			System.out.println("������");
			break;
		case 0:
			System.out.println("������");
			break;
		default:
			System.out.println("���벻�Ϸ�");
			break;
		}// switch�Ľ�β
	}
}
