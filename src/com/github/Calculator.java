package com.github;

public class Calculator {
	
	public static void add(int a, int b)
	{
		System.out.println("sum:"+ (a+b));
	}
	
	public static void substract(int a, int b)
	{
		System.out.println("substract:" + Math.abs(a-b));
	}
	
	public static void divide(int a, int b)
	{
		System.out.println("divide:"+ a/b);
	}
	
	public static void main(String[] args)
	{
		add(10,30);
		substract(10,6);
		divide(90,60);
	}

}
