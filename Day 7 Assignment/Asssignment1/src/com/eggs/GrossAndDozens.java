package com.eggs;



public class GrossAndDozens {

			private int eggs;		
		public GrossAndDozens(int n)
			{
				eggs=n;
			}
		
			public void grossEggs()
			{
				System.out.println((eggs/144)+" gross eggs");
				eggs%=144;
				System.out.println((eggs/12)+" dozen eggs");
				eggs%=12;
				System.out.println(eggs+" left eggs");

			}
	}

