package cn.ken;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl+shift+o  ������ݼ�
	   //�����������¸��� Ctrl+Alt+����
	   //�������������ƶ� Alt+����
	 // Դ��  F3
		Scanner sc=new  Scanner(System.in); 
		System.out.println("������һ������");
		System.out.println("������һ������");
		System.out.println("������һ������");
		System.out.println("������һ������");
		System.out.println("������һ������");
		System.out.println("������һ������");
		int b=sc.nextInt();
		shuChu(b);

	}
	public static void shuChu(int a){
		for (int i = 1; i <= a; i++) {
			System.out.println(i);
		}
		
	}

}
