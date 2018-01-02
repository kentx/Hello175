package cn.ken;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int[] arr=new int[a];
          shuChuArray(arr);
          
	}
	public static void shuChuArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
		
	}
	

}
