package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex05_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數(將判斷奇偶): ");
		int x = scn.nextInt();
		if(x%2==0){
			System.out.println("偶數");
		}else{		
				System.out.println("奇數");
		}
	}
}