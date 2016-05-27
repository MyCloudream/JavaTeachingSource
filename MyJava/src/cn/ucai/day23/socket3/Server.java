package cn.ucai.day23.socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	/**
	 * 聊天－服务端
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BufferedReader reader = null;
		PrintWriter writer = null;
		ServerSocket server = null;
		try {
			// 创建服务端的套接字
			server = new ServerSocket(8899);
			System.out.println("等待客户访问...");
			Socket socket = server.accept();
			// 创建字符输入流和字符输出流
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
			String question;
			String answer;
			while (true) {
				// 获取客户端的提问
				question = reader.readLine();
				System.out.println(question);
				// 若有一个发出88文本，则结束对话
				if (question.indexOf("88") >= 0) {
					writer.println("卖家:88");
					writer.flush();
					break;
				}
				System.out.print("卖家:");
				// 向客户端输出回答信息
				answer = scanner.nextLine();
				writer.println("卖家:" + answer);
				writer.flush();
			}
			System.out.println("本次对话结束");
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
				if (server != null) {
					server.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
