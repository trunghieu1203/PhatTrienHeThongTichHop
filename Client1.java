package lab3;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//Bài 2

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Socket client = new Socket("LocalHost", 1225);
			System.out.println("Client da duoc tao");
			Scanner inFromServer = new Scanner(client.getInputStream());
			PrintStream outToServer = new PrintStream(client.getOutputStream());
			System.out.println("server: " + inFromServer.nextLine());
			Scanner scan = new Scanner(System.in);
			String name=scan.nextLine();
			outToServer.println(name);
			System.out.println("server: " + inFromServer.nextLine());
			} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}		
		}

	}


