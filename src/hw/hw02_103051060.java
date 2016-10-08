package hw;
/*
 * Topic: 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/03
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a =0;
		int b =0;
		int c =0;
		while(true){
		System.out.println("請問是否要輸入數值(Y/N): ");
		char checkChar = scn.next().charAt(0);
		if(checkChar=='Y'||checkChar=='y'){
			System.out.println("請輸入數值: ");
			int x = scn.nextInt();
			if(x>0){
				a++;
			}else if(x<0){
				b++;
			}else if(x==0){
				c++;
			}
		}else if(checkChar=='N'||checkChar=='n'){
			System.out.print("正數有"+a+"個\n"+"負數有"+b+"個\n"+"零有"+c+"個\n");
			break;
		}
		}
	}

}
