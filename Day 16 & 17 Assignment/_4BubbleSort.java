package com.testclasses;

public class _4BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		System.out.print("Array Before Sort: ");
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        
        bubbleSort(arr);
        
        System.out.println();
        System.out.print("Array After Sort : ");
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
	}
	
	static void bubbleSort(int[] arr) 
	{
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
