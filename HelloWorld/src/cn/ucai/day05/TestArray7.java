package cn.ucai.day05;

public class TestArray7 {
	public static void main(String[] args) {
		int[] niArr = new int[5];
		for(int i=0;i<5;i++){
			niArr[i] = i;
		}
		
		int[] niArr2 = niArr;
		
		System.out.println(niArr2[2]);// 2
		
		niArr2[2] = 10;
		
		System.out.println(niArr[2]); // 10
	}
}
