package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class BankServiceImpl implements BankService {

	public static void main(String[] args) throws Exception {
		final int length = 100;
		String host = "localhost";
		int port = 8080;
		Socket socket = new Socket(host, port);
		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		 System.out.println("Client:"+in.readLine());
		socket.close();
	}

	public String mobileVerificationCodeQuery(String param) {
		return null;
	}

	public String accountBinding(String param) {
		return null;
	}

	public String accountUnbundling(String param) {
		return null;
	}

	public String bankPayment(String param) {
		return null;
	}

	public String queryBankPayment(String param) {
		return null;
	}

	public String statement(String param) {
		return null;
	}

}
