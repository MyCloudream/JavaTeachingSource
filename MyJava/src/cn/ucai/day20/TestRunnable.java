package cn.ucai.day20;

/**
 * �ڶ��ִ����̵߳ķ�ʽ
 */
public class TestRunnable {
	public static void main(String[] args) {
		// �����߳�
		MyThread mt = new MyThread();
		Thread th = new Thread(mt);
		th.start();// ֪ͨ������������߳�
		for(int i=0;i<40;i++){
			System.out.println(Thread.currentThread().getName()+"-------"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static class MyThread implements Runnable{
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
