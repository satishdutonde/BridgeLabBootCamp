package com.testclasses;

public class CharacterCount {

	public static void main(String[] args) {
		String s="assembly";
		int []arr=new int[26];
		
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)-'a']++;
		}
		
		char ch='s';
		System.out.println("The count of"+ch+" is :"+arr[ch-'a']);
	}
}
