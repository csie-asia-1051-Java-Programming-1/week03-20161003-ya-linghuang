package ex;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一字串(將反向輸出): ");
		String str = scn.nextLine();
		String strR = new StringBuilder(str).reverse().toString();
		System.out.println(strR);
	}

}
