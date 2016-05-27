package cn.ucai.day04;

import cn.ucai.tools.InputTools;
import cn.ucai.tools.RandomTools;

public class TestGuessNum {
	public static void main(String[] args) {
		/*for(int i=0;i<100;i++){
			// 得到0-n的随机数 [0,n)
			int ran = RandomTools.getRandomInt(5);
			System.out.println(ran);
		}*/
//		int num = RandomTools.getRandomInt(40)+20;
		int num = RandomTools.getRandomInt(100);
		for(;;){
			System.out.println("输入一个0-100内的整数");
			int ni = InputTools.getInputInt();
			if(ni==num){
				System.out.println("猜对了");
				break;
			}else if(ni<num){
				System.out.println("猜小了");
//				continue;
			}else if(ni>num){
				System.out.println("猜大了");
//				continue;
			}
		}
	}
}
