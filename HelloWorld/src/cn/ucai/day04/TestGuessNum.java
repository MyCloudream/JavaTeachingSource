package cn.ucai.day04;

import cn.ucai.tools.InputTools;
import cn.ucai.tools.RandomTools;

public class TestGuessNum {
	public static void main(String[] args) {
		/*for(int i=0;i<100;i++){
			// �õ�0-n������� [0,n)
			int ran = RandomTools.getRandomInt(5);
			System.out.println(ran);
		}*/
//		int num = RandomTools.getRandomInt(40)+20;
		int num = RandomTools.getRandomInt(100);
		for(;;){
			System.out.println("����һ��0-100�ڵ�����");
			int ni = InputTools.getInputInt();
			if(ni==num){
				System.out.println("�¶���");
				break;
			}else if(ni<num){
				System.out.println("��С��");
//				continue;
			}else if(ni>num){
				System.out.println("�´���");
//				continue;
			}
		}
	}
}
