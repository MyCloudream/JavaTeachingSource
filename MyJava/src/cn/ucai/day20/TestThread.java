package cn.ucai.day20;

/**
 * �����̵߳ĵ�һ�ַ�ʽ
 */
public class TestThread {
	public static void main(String[] args) {
		// �½����߳� main
		// �����߳�
		MyThread mt = new MyThread();
		mt.start();// ֪ͨ������������߳� ����֮��ִ��run����ķ���
		// ����ʱ��Ҫʱ���
		for(int i=0;i<40;i++){
			System.out.println(Thread.currentThread().getName()+"-------"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static class MyThread extends Thread{
		@Override
		public void run() {
			for(int i=0;i<40;i++){
				System.out.println(Thread.currentThread().getName()+"-------"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
