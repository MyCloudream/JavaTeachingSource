package cn.ucai.test;

public class MyMath {
	// ��̬���������ڴ洢���н��
	private static int result;

	public void add(int n) {
		result = result + n;
	}

	public void substract(int n) {
		result = result - 1; // Bug: ��ȷ��Ӧ���� result =result-n
	}

	public void multiply(int n) {
	} // �˷�����δд��

	public void divide(int n) {
		result = result / n;
	}

	public void square(int n) {
		result = n * n;
	}

	public void squareRoot(int n) {
		for (;;); // Bug : ��ѭ��
	}

	public void clear() { // ���������
		result = 0;
	}

	public int getResult() {
		return result;
	}
	
}
