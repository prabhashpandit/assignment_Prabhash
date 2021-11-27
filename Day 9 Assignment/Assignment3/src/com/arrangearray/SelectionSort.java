package com.arrangearray;

public class SelectionSort {

	private void selectionSort(int array[])
	{
	int n = array.length;
	for (int i = 0; i < n-1; i++)
	{
	int min_element = i;
	for (int j = i+1; j < n; j++)
	if (array[j] < array[min_element])
	min_element = j;
	int temp = array[min_element];
	array[min_element] = array[i];
	array[i] = temp;
	}
	}
	
	private void printarray(int array[])
	{
	int n = array.length;
	for (int i=0; i<n; ++i)
	System.out.print(array[i]+" ");
	System.out.println();
	}

	public static void main(String args[])
	{
	SelectionSort ob = new SelectionSort();
	int array[] = {65, 85, 39, 67, 96, 59};
	ob.selectionSort(array);
	System.out.println("array in ascending order ");
	ob.printarray(array);
	}
}
