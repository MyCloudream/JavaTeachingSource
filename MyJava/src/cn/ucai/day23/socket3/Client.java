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
			// �����ͻ����׽���
			socket = new Socket("127.0.0.1", 8899);
			// �����ַ����������ַ������
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
			String answer = "";
			String question = "";
			while (true) {
				// ����������
				System.out.print("���:");
				question = scanner.nextLine();
				writer.println("���:" + question);
				writer.flush();
				// ��ȡ����˵Ļش�
				answer = reader.readLine();
				System.out.println(answer);
				// ����һ������88�ı���������Ի�
				if (answer.indexOf("88") >= 0) {
					writer.println("��ң�88");
					writer.flush();
					System.out.println("���ζԻ�����");
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
