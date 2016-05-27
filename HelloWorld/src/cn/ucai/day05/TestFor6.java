package cn.ucai.day05;

import cn.ucai.tools.InputTools;

public class TestFor6 {
	public static void main(String[] args) {
		System.out.println("ÊäÈëÊ¥µ®Ê÷ÊıÁ¿£º");
		int nums = InputTools.getInputInt();
		for(int h=0;h<nums;h++){
			for(int m=0;m<3;m++){
				// m 0 1 2 
				// n 3 6 9  n=3*(m+1)
				//   6 3 0 
				for(int i=0;i<3*(m+1);i++){
					for(int k=0;k<3*(m+1)-1-i+(9-3*(m+1));k++){
						System.out.print(" ");
					}
					for(int j=0;j<(2*i+1);j++){
						System.out.print("*");
					}
					System.out.println();
				}
			}
			for(int i=0;i<8;i++){
				for(int k=0;k<7;k++){
					System.out.print(" ");
				}
				for(int j=0;j<3;j++){
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
}
