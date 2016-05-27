package cn.ucai.day05;

public class TestArray {
	public static void main(String[] args) {
		// 数组：表示能存储固定个数个固定数据类型数据的容器
		int niScoreArr2[] = new int[20];
		
		int[] niScoreArr1 = new int[3];
		// 元素：数组中的每一个数  有默认值
		// 93 89 78
		System.out.println(niScoreArr1[0]);
		System.out.println(niScoreArr1[1]);
		System.out.println(niScoreArr1[2]);
//		System.out.println(niScoreArr1[3]);
		niScoreArr1[0] = 93;
		niScoreArr1[1] = 89;
		niScoreArr1[2] = 78;
		for(int i=0;i<3;i++){
			System.out.println(niScoreArr1[i]);
		}
	}
}
