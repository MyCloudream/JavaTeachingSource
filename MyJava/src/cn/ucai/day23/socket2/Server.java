package cn.ucai.day23.socket2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		PrintWriter writer=null;
		OutputStream out=null;
		ServerSocket server=null;
		try {
			//创建服务端套接字
			server=new ServerSocket(9999);
			System.out.println("等待客户端的连接.....");
			Socket socket=server.accept();
			//获取输出流
			out=socket.getOutputStream(); // 话筒
			//获取文本输出流
			writer=new PrintWriter(out);
			//向客户端发送两行文本
			writer.println("这是服务端发来的信息，注意后面还有一行");
			writer.println("这是第二行字符串");
			writer.flush();//刷新缓冲区
			
			writer.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
