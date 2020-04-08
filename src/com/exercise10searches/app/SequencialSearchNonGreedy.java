package com.exercise10searches.app;

import java.util.Random;
import java.util.Scanner;

public class SequencialSearchNonGreedy 
{

	public static void main(String[] args) 
	{
		//Constants declaration
		final int ELEMENTS_ARRAY=10;
		
		//Variable declaration
		int numberToFind=0;
		int indexFound=-1;
		
		//Array declaration
		int[] vector = new int[ELEMENTS_ARRAY];
		
		Random numbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			vector[i] = numbers.nextInt(101);
		}
		
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.print(vector[i]+" ");
		}
		
		System.out.println(" ");
		
		do 
		{
			System.out.println("Input the value to find inside the array:");
			
			numberToFind=input.nextInt();
			if(numberToFind<0)
			{
				System.out.println("Number must be greater than or equal to Zero!!!");
			}
		}while(numberToFind<0);
		
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			if(numberToFind==vector[i])
			{
				indexFound=i;
				break;
			}
		}
		if (indexFound!=-1)
		{
			System.out.println("Element found at index:"+indexFound);
		}
		else
		{
			System.out.println("Element not found!!!");
		}
		
		while(!isFound==false && i<ELEMENTS_ARRAY)
			
		{
			if(numberToFind==vector[index])
			{
				indexFound=index;
				isFound=true;
			}
			index++;
		}
		
		if (indexFound!=-1)
		{
			System.out.println("Element found at index:"+indexFound);
		}
		else
		{
			System.out.println("Element not found!!!");
		}
		input.close();
	}

}
