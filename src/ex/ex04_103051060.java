package ex;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex04_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一串數字(將計算其和): ");
		long v1 = scn.nextLong();
		long sum = 0;
		while(v1>0){
			sum=sum+v1%10;
			v1=v1/10;
		}
		System.out.println("總合為: "+sum);
	}

}
