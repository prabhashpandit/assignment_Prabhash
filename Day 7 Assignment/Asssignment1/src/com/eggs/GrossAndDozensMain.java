package com.eggs;

import java.util.Scanner;

public class GrossAndDozensMain {
			public static void main(String args[]) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				GrossAndDozens user=new GrossAndDozens(n);
				user.grossEggs();
				
			}

	}
