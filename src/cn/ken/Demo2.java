package cn.ken;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl+shift+o  导包快捷键
	   //代码向上向下复制 Ctrl+Alt+上下
	   //代码向上向下移动 Alt+上下
	 // 源码  F3
		Scanner sc=new  Scanner(System.in); 
		System.out.println("请输入一个数：");
		System.out.println("请输入一个数：");
		System.out.println("请输入一个数：");
		System.out.println("请输入一个数：");
		System.out.println("请输入一个数：");
		System.out.println("请输入一个数：");
		int b=sc.nextInt();
		shuChu(b);

	}
	public static void shuChu(int a){
		for (int i = 1; i <= a; i++) {
			System.out.println(i);
		}
		
	}

}
