package cn.ucai.day04.homework;

import cn.ucai.tools.InputTools;

/**
 * ����������������һ������0��ʾ�˳��������Щ������������
 * ����������ѭ������ѭ��+break
 */
public class Test10 {
	public static void main(String[] args) {
		int max = 0;
		for(;;){
			System.out.println("����:");
			int ni = InputTools.getInputInt();
			if(ni==0){
				break;
			}else{
				if(max<=ni){
					max = ni;
				}
			}
		}
		System.out.println("���ֵ��"+max);
	}
}
