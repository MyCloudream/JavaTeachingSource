package cn.ucai.day20;

/**
 * 第二种创建线程的方式
 */
public class TestRunnable {
	public static void main(String[] args) {
		// 启动线程
		MyThread mt = new MyThread();
		Thread th = new Thread(mt);
		th.start();// 通知虚拟机启动新线程
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
