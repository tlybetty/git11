package com.javatly.day11;
import java.util.Scanner;
public class Test
{
	public static void main(String [] args){
		Test test=new Test();
		test.test3();
	
	}
	public void test3(){
		int[]arr=new int[]{9,3,3,4};
		int[]arr2=new int[8];
		System.arraycopy(arr,2,arr2,0,arr.length-2);
		showArray(arr);
		showArray(arr2);	
	}
	public void showArray(int[]arr){
		for(int i :arr){
			System.out.print(i+",");
	  }
			System.out.println();
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
			System.out.print("������������");
			String i=sc.nextLine();
		    System.out.println("i:"+i);
		
		
		}
	
	}
}