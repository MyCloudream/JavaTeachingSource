package cn.ucai.day20;

public class Homework {

	public static void main(String[] args) {
		// �̳߳�
		getImages2(1,100);
		getImages2(90,95);
	}
	
	public static void getImages2(int start,int end){
		for(int i=start;i<=end;i++){
			MyThread mt = new MyThread(i);
			mt.start();
		}
	}
	
	// ����һҳ��50ͼƬ �ص�����
	public static void getImages(String path){
		
	}
	
	public static class MyThread extends Thread{
		private int i;
		public MyThread(int i){
			this.i = i;
		}
		@Override
		public void run() {
			String pagePath = "http://www.58pic.com/app/0/id-"+i+".html";
			getImages(pagePath);
		}
	}
}
