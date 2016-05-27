package cn.ucai.day20;

/**
 * 创建线程的第一种方式
 */
public class TestThread {
	public static void main(String[] args) {
		// 新建了线程 main
		// 启动线程
		MyThread mt = new MyThread();
		mt.start();// 通知虚拟机，启动线程 启动之后执行run里面的方法
		// 启动时需要时间的
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
