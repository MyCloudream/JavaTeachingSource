package cn.ucai.day04;

import cn.ucai.tools.InputTools;

public class TestIf2 {
	public static void main(String[] args) {
		System.out.println("���������ĳɼ���");
		int scoreChi = InputTools.getInputInt();
		System.out.println("��������ѧ�ɼ���");
		int scoreMath = InputTools.getInputInt();
		/*if(scoreChi>=90){// ����>=90
			if(scoreMath>=90){
				System.out.println("����");
			}else if(scoreMath<60){
				System.out.println("ƫ��");
			}
		}else if(scoreChi<60){// ����<90      ����<60 ��ѧ>=90
			if(scoreMath>=90){
				System.out.println("ƫ��");
			}
		}*/
		// 9 99 
		if(scoreChi>=90 && scoreMath>=90){
			System.out.println("����");
		}else if((scoreChi>=90&&scoreMath<60)||(scoreChi<60&&scoreMath>=90)){
			System.out.println("ƫ��");
		}
	}
}
