//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：
//(提示：Scanner，亂數方法，無窮迴圈)
//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案) 

package hw3;

import java.util.Scanner;

public class Hw3_02 {
	
	public static void main(String[] args) {
		
		int n,r;
		r = (int)((Math.random()*10));
		//System.out.println(r);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!(0~9)");
		
		while(true) {
			n = sc.nextInt();
			if(n == r)
				break;
			System.out.println("猜錯囉~");
		}
		System.out.println("答對了，答案是 " + r);
	}
}
