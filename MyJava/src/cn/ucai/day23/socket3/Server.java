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
	 * ���죭�����
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BufferedReader reader = null;
		PrintWriter writer = null;
		ServerSocket server = null;
		try {
			// ��������˵��׽���
			server = new ServerSocket(8899);
			System.out.println("�ȴ��ͻ�����...");
			Socket socket = server.accept();
			// �����ַ����������ַ������
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
			String question;
			String answer;
			while (true) {
				// ��ȡ�ͻ��˵�����
				question = reader.readLine();
				System.out.println(question);
				// ����һ������88�ı���������Ի�
				if (question.indexOf("88") >= 0) {
					writer.println("����:88");
					writer.flush();
					break;
				}
				System.out.print("����:");
				// ��ͻ�������ش���Ϣ
				answer = scanner.nextLine();
				writer.println("����:" + answer);
				writer.flush();
			}
			System.out.println("���ζԻ�����");
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
