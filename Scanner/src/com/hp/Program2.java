package com.hp;
//BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 
{

	public static void main(String[] args) throws IOException 
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter Your Name");
		String str = br.readLine();
		System.out.println("Your Name is :-" + str);

	}

}
