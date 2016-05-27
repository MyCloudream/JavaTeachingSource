package cn.ucai.day06;

public class TestBreak {
	public static void main(String[] args) {
		// i0 j0-4
		// i1 j0-4
		// i2 j0 1 2 3
		// i3 j0-4
		// i4 j0-4
		// 1°¢C”Ô—‘goto
		abc: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 && j == 3) {
					break abc;
				}
			}
		}
		// ±£¡Ù◊÷£∫goto const
		boolean flag = false;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 && j == 3) {
					flag = true;
					break;
				}
			}
			if(flag){
				break;
			}
		}
	}
}
