package com.javatly.day11;
import java.util.Scanner;
public class Test
{
	public static void main(String [] args){
		Test test=new Test();
		test.test2();
	
	}
	public void test2(){
		String info="1001#terry#12";
		String [] arr=info.split("#");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	public void test1(){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("ÇëÊäÈëÕûÊı£º");
			String i=sc.nextLine();
		    System.out.println("i:"+i);
		
		
		}
	
	}
}