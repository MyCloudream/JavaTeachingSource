package cn.ucai.day05;

public class TestFor5 {
	public static void main(String[] args) {
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
		
	}
}
