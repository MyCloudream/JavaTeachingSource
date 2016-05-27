package cn.ucai.day23.socket1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		//声明字符输出流
		PrintWriter writer=null;
		//声明输出流
		OutputStream out=null;
		try {
			//创建客户端套接字，指明连接的服务端地址和端口号
			Socket socket=new Socket("127.0.0.1", 8899);
			System.out.println(socket);
			//获取输出流
			out=socket.getOutputStream();// 话筒
			//创建字符输出流
			writer=new PrintWriter(out);
			//向输出流写入字符串，该字符串将输出至服务端的输入流
			writer.println("我是客户端！");
			//刷新缓冲区，确保输出的字符串写入输出流
			writer.flush();
			socket.close();//关闭套接字对象
			writer.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
