package cn.ucai.day04.homework;

import cn.ucai.tools.RandomTools;

/**
 * �������10��������Ҫ�������������[60,100]֮�䣩���ҳ����������
 */
public class Test12 {
	public static void main(String[] args) {
		int max = 0;
		for(int i=0;i<10;i++){
			int ran = RandomTools.getRandomInt(41)+60;
			System.out.println(ran);
			if(max<=ran){
				max = ran;
			}
		}
		System.out.println("���ֵ��"+max);
	}
}
