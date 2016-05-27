package cn.ucai.day20;

public class Homework {

	public static void main(String[] args) {
		new Homework().getImages2(1, 10);
	}
	
	public void getImages2(int start,int end){
		for(int i=start;i<=end;i++){
			MyThread mt = new MyThread(i,this);
			mt.start();
		}
	}
	
	// 下载一页的50图片 回调方法
	public void getImages(String path){
		System.out.println("回调");
	}
}
