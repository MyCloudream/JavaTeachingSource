package cn.ucai.day05;

public class TestFor3 {
	public static void main(String[] args) {
		int n = 10;
		for(int i=0;i<5;i++){
			for(int j=0;j<10;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++){
			// 0---4
			// 1---5
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<5;i++){
			// 0 1 2 3 4
			// 5 4 3 2 1 a+b=5; a=5-b;
			for(int j=0;j<5-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<5;i++){
			// 0-4
			for(int k=0;k<i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++){
			// 0 1 2 3 4
			// 4 3 2 1 0
			for(int k=0;k<4-i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
