package cn.ucai.day04.game;

import cn.ucai.tools.RandomTools;

public class TestWhile {
	public static void main(String[] args) {
		/*int i = 0;
		for(;i<10;){
			System.out.println("i:"+i);
			i++;
		}
		
		int j = 0;
		while(j<10){
			System.out.println("j:"+j);
			j++;
		}*/
		
		boolean noGirlFriend = true;
		int count = 0;
		while(noGirlFriend){// ��û��Ů���ѵ�ʱ��
			System.out.println("����");
			System.out.println("���ѽ���");
			count ++ ;
			System.out.println("���Ѿ�����"+count+"��");
			int ni = RandomTools.getRandomInt(31);
			if(ni==15){
				noGirlFriend = false;
				System.out.println("�ҵ���Ů����");
			}
		}
	}
}
