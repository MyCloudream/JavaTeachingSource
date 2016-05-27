package cn.ucai.day05;

public class TestFor2 {
	public static void main(String[] args) {
		// i1 j1 k2 4 6 8 16
		// i1 j2 k2 4 6 8 16
		for(int i=1;i<=6;i++){
			for(int j=1;j<=12;j++){
				for(int k=0;k<=16;k=k+2){
					if(i+j+k==16&&i*10+j*4+k/2==55){
						System.out.println(i);
						System.out.println(j);
						System.out.println(k);
					}
				}
			}
		}
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=12;j++){
				if(i*10+j*4+(16-i-j)/2==55){
					System.out.println(i);
					System.out.println(j);
					System.out.println(16-i-j);
				}
			}
		}
	}
}
