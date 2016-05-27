package cn.ucai.day05;

public class TestFor4 {
	public static void main(String[] args) {
		int n = 3;
		for(int i=0;i<n;i++){
			// 0 1 2 3
			// 3 2 1 0
			for(int k=0;k<n-1-i+6;k++){
				System.out.print(" ");
			}
			// 0 1 2
			// 1 3 5
			for(int j=0;j<(2*i+1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		n = 6;
		for(int i=0;i<n;i++){
			for(int k=0;k<n-1-i+3;k++){
				System.out.print(" ");
			}
			for(int j=0;j<(2*i+1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		n = 9;
		for(int i=0;i<n;i++){
			for(int k=0;k<n-1-i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<(2*i+1);j++){
				System.out.print("*");
			}
			System.out.println();
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
