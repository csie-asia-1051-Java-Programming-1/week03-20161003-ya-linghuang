package ex;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字元(將判斷大寫小寫或其他): ");
		char ch = scn.next().charAt(0);
		int v1 =ch-'a';
		if(v1>=0&&v1<26){
			System.out.println("是小寫");
		}else{
			v1=ch-'A';
			if(v1>=0&&v1<26){
				System.out.println("是大寫");
		}else{
			System.out.println("其他");
		}
		}
	}

}
