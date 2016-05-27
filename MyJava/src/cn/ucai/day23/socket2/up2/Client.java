package cn.ucai.day23.socket2.up2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		InputStream in=null;
		InputStreamReader isr=null;
		BufferedReader reader=null;
		Socket socket=null;
		PrintWriter writer=null;
		OutputStream out=null;
		try {
			socket=new Socket("127.0.0.1", 9999);
			in=socket.getInputStream();// 听筒
			isr=new InputStreamReader(in);
			reader=new BufferedReader(isr);
			String back = reader.readLine();
			System.out.println("服务端发送来的字符串："+back);
			
			//获取输出流
			out=socket.getOutputStream(); // 话筒
			//获取文本输出流
			writer=new PrintWriter(out);
			//向客户端发送两行文本
			writer.println("客户端数据！！");
			writer.flush();//刷新缓冲区

			reader.close();
			writer.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
