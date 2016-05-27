package cn.ucai.day04.homework;

import cn.ucai.tools.RandomTools;

/**
 * 随机产生10个整数（要求产生的整数在[60,100]之间），找出最大整数。
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
		System.out.println("最大值："+max);
	}
}
