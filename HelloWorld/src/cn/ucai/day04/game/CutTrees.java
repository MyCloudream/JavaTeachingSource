package cn.ucai.day04.game;

import cn.ucai.tools.InputTools;
import cn.ucai.tools.RandomTools;
/**
 * ��һ����HP-1;
 * HP = 500;
 * 
 * 1���ٲ�����   һ���ܿ���һ����   8��   -6
 * 2�� Ѫս�˷�  һ���ܿ�8��     3��    50 
 */
public class CutTrees {
	public static void main(String[] args) {
		int treeHP = 1000;
		/** �Ѿ������������� **/
		int treeCut = 0;
		int myHP = 500;
		int skill2Times = 8;
		int skill3Times = 3;
		int maxTrees = Integer.MAX_VALUE;
		System.out.println("��ӭ����ucaiɭ��");
		System.out.println("ǧ����⡢����ѩƮ������Ҫ��һ�ѻ�");
		System.out.println("����������"+Integer.MAX_VALUE+"����,������ĸ�ͷ������");
		System.out.println("����������1����");
		for(;;){
			int ni = InputTools.getInputInt();
			if(ni==1){
				// [80-120]
				int hurt = RandomTools.getRandomInt(41)+80;
				// ����
				if(hurt==88 || hurt==99 || hurt==111){
					hurt *= 3;
				}else if(hurt==100){
					hurt *= 10;
				}
				treeHP -= hurt;
				if(treeHP<0){
					treeHP = 0;
				}
				myHP--;
				System.out.println("��ʹ���˿�ս֮ŭ�����������"+hurt+"���˺�,������ʣ"+treeHP+"���������㵱ǰ������ֵΪ��"+myHP+",���ͣ�");
				if(myHP==0){
					System.out.println("���ѱ������������¿�ʼ��Ϸ");
					break;
				}
				if(treeHP<=0){
					treeCut ++; 
					System.out.println("��ϲ���㿳����"+treeCut+"����,ʣ��"+maxTrees--+"����");
					treeHP = 1000;
				}
			}else if(ni==2){
				if(skill2Times<=0){
					System.out.println("�������þ�");
					continue;
				}
				skill2Times -- ;
				myHP -= 6;
				treeCut ++;
				System.out.println("��ʹ���˰ٲ����������1�������㵱ǰ������ֵΪ��"+myHP+",���ͣ�");
			}else if(ni==3){
				if(skill3Times<=0){
					System.out.println("�������þ�");
					continue;
				}
				skill3Times -- ;
				myHP -= 50;
				treeCut += 8;
				System.out.println("��ʹ����Ѫս�˷���������8�������㵱ǰ������ֵΪ��"+myHP+",���ͣ�");
			}else{
				System.out.println("����������1���п���");
				continue;
			}
			
			// ����
			if(treeCut>=10){
				System.out.println("��ϲ������ȥ�����ˣ�����������0����");
				int ni0 = InputTools.getInputInt();
				if(ni0==0){
					int ran = RandomTools.getRandomInt(5);
					if(ran==2){
						System.out.println("��ϲ������ɹ�����");
						break;
					}else{
						System.out.println("����ʧ��,�����¿���");
						treeCut -= 10;
					}
				}
			}
		}
	}
}
