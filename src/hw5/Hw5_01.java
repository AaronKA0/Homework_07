//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//圖： 請輸入寬與高：	5  4
//					*****
//					*****
//					*****
//					*****

package hw5;

import java.util.Scanner;

public class Hw5_01 {

	public static void starSquare(int width, int height) {
		
		for (int i = 0; i < height; i++) {		//代表高度行數
			for(int j = 0; j < width; j++)		//代表寬度一行幾顆星星
				System.out.print("*");
			System.out.println("");				//每行印完換行
		}
	}
	
	public static void main(String[] args) {
		
		int width = 0, height = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入寬與高");
		width = sc.nextInt();					//使用者輸入寬度
		height = sc.nextInt();					//使用者輸入高度
		
		while(width <= 0 || height <= 0) {		//若其中一個沒有大於0，請使用者重新輸入
			System.out.println("請輸入大於0的寬與高");
			width = sc.nextInt();
			height = sc.nextInt();
		}
		
		starSquare(width, height);				//呼叫starSquare方法，帶入所輸入的參數執行
		
	}
}
