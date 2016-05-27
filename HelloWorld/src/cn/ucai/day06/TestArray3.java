package cn.ucai.day06;

public class TestArray3 {
	public static void main(String[] args) {
		int[][] arr = new int[2][];
		// 把一维新创建出来
		arr[0] = new int[4];
		arr[0][0] = 25;
		arr[0][1] = 18;
		arr[0][2] = 19; 
		arr[0][3] = 20;  
		arr[1] = new int[2];
		arr[1][0] = 30; 
		arr[1][1] = 21;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
		}
	}
}

