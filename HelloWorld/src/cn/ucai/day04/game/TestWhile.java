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
		while(noGirlFriend){// 当没有女朋友的时候
			System.out.println("相亲");
			System.out.println("朋友介绍");
			count ++ ;
			System.out.println("你已经找了"+count+"次");
			int ni = RandomTools.getRandomInt(31);
			if(ni==15){
				noGirlFriend = false;
				System.out.println("找到了女朋友");
			}
		}
	}
}
