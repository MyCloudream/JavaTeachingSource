package cn.ucai.day06;

import cn.ucai.tools.InputTools;

public class TestRoleSelect {
	public static void main(String[] args) {
		// ��̬��ʼ��
		// Ѫ�� ��ͨ���� ħ������ ����
		int[][] niAttr = {
				{100,7,2,3},
				{120,6,7,4},
				{90,7,5,4},
				{150,7,4,7}
		};
		
		String[][] strSkills = {
				{"��˪���","ȫ���ע","����뷢","ӥ������","ħ��ˮ����"},
				{"������ʿ","�������","��ʯ�����","���龫��","����ǿϮ"},
				{"��ŷ�����ȳ�","���г��","������̬","������","�������"},
				{"�籩�ľ���","��������","��Ұŭ��","��������","����ŭצ"}
		};
		
		String[] nameArr = {"��������","��ϫ����","������־","����֮ŭ"};
		String[] skillAttr = {"Ѫ��","��ͨ����","ħ������","����"};
		System.out.println("�������ɫ���ƣ�");
		String name = InputTools.getInputString();
		for(int i=0;i<nameArr.length;i++){
			if(name.equals(nameArr[i])){
				for(int j=0;j<niAttr[i].length;j++){
					System.out.println(name+"��"+skillAttr[j]+"Ϊ��"+niAttr[i][j]);
				}
				for(int j=0;j<strSkills[i].length;j++){
					System.out.println(name+"�ĵ�"+(j+1)+"������Ϊ��"+strSkills[i][j]);
				}
			}
		}
	}
}
