package cn.ucai.day23.socket2.up2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		PrintWriter writer=null;
		OutputStream out=null;
		ServerSocket server=null;
		InputStream in=null;
		InputStreamReader isr=null;
		BufferedReader reader=null;
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
			writer.println("服务端数据！！");
			writer.flush();//刷新缓冲区
			
			in=socket.getInputStream();// 听筒
			isr=new InputStreamReader(in);
			reader=new BufferedReader(isr);
			String back = reader.readLine();
			System.out.println("客户端发送来的字符串："+back);
			
			writer.close();
			reader.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
