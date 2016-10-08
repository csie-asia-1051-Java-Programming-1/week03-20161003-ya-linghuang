package hw;
/*
 * Topic: 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
 * Date: 2016/10/03
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw05_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數n: ");
		int n = scn.nextInt();
		int x =0;
		for(int i =1;i<=n;i++){
			x=x+(i*(i+1));
		}
		System.out.println("結果為: " + x);
	}

}
