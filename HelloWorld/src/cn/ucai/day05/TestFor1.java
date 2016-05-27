package cn.ucai.day05;

public class TestFor1 {
	// 35 94 
	public static void main(String[] args) {
		// i 鸡数量
		/*for(int i=1;i<=35;i++){
			if(i*2+(35-i)*4==94){
				System.out.println(i);
				System.out.println(35-i);
				break;
			}
		}*/
		// i 鸡数量
		// i1 n1 n2 n3 n4 n35
		// i2 n1 n2 n3 n4 ... n35
		// i3 n1 n2 n3 ... n35
		// i23 n1 n2 ... n12 
		// 1 2 4 5 7 6 5 7 6 5
		// 1 2 a 3 2 a 3 2 a 3 2
		// i1 n1 n2 n3 n4  ... n34 n35 
		// i2 n1 n2 ... n35
		for(int i=1;i<=35;i++){
			for(int n=1;n<=35;n++){
				if(i+n==35&&i*2+n*4==94){
					System.out.println(i);
					System.out.println(n);
				}
			}
		}
	}
}
