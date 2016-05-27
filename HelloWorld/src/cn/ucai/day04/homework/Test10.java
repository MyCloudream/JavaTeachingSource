package cn.ucai.day04.homework;

import cn.ucai.tools.InputTools;

/**
 * 输入任意多数，最后一个数是0表示退出，输出这些数中最大的数。
 * 不定次数的循环：死循环+break
 */
public class Test10 {
	public static void main(String[] args) {
		int max = 0;
		for(;;){
			System.out.println("输入:");
			int ni = InputTools.getInputInt();
			if(ni==0){
				break;
			}else{
				if(max<=ni){
					max = ni;
				}
			}
		}
		System.out.println("最大值："+max);
	}
}
