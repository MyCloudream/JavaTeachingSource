package cn.ucai.day23.socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		BufferedReader reader = null;
		PrintWriter writer = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			// 创建客户端套接字
			socket = new Socket("127.0.0.1", 8899);
			// 创建字符输入流和字符输出流
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
			String answer = "";
			String question = "";
			while (true) {
				// 向服务端提问
				System.out.print("买家:");
				question = scanner.nextLine();
				writer.println("买家:" + question);
				writer.flush();
				// 获取服务端的回答
				answer = reader.readLine();
				System.out.println(answer);
				// 若有一个发出88文本，则结束对话
				if (answer.indexOf("88") >= 0) {
					writer.println("买家：88");
					writer.flush();
					System.out.println("本次对话结束");
					break;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
