package cn.ucai.day05;

import java.util.Arrays;

import cn.ucai.tools.InputTools;

public class TestArray4 {
	public static void main(String[] args) {
		// ��������  ѧ������  10
		System.out.println("������༶������");
		int nums = InputTools.getInputInt();
		String[] nameArr = new String[nums];
		System.out.println(nameArr[0]);
		int[] noArr = new int[nums];
		// for:���ѧ��������ѧ�ŵ�¼�빤��
		for(int i=0;i<nameArr.length;i++){
			System.out.println("������������");
			String name = InputTools.getInputString();
			nameArr[i] = name;
			System.out.println("������ѧ��");
			int no = InputTools.getInputInt();
			noArr[i] = no;
		}
		// �����������Ԫ��
		System.out.println(Arrays.toString(nameArr));
		System.out.println(Arrays.toString(noArr));
		System.out.println("������Ҫ����ѧ�ŵ�����");
		String name = InputTools.getInputString();
		// ����
		for(int i=0;i<nameArr.length;i++){
			if(nameArr[i].equals(name)){
				System.out.println(name+"ͬѧ��ѧ��Ϊ��"+noArr[i]);
				break;
			}
		}
	}
}
