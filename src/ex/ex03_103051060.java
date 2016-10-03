package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字元(將轉換大小寫): ");
		char ch = scn.next().charAt(0);
		int v1 =ch-'a';
		if(v1>=0&&v1<26){
			System.out.println((char)(v1+'A'));
		}else{
			v1=ch-'A';
			if(v1>=0&&v1<26){
				System.out.println((char)(v1+'a'));
		}else{
			System.out.println("請輸入英文字母");
		}
		}
	}

}
