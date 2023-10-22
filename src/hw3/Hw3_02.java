//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，
//猜對則顯示正確訊息，如圖示結果：
//(提示：Scanner，亂數方法，無窮迴圈)
//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案) 

package hw3;

import java.util.Scanner;

public class Hw3_02 {
	
	public static void main(String[] args) {
		
		int n;									//宣告n用於放入猜測的數值
		int r = (int)(Math.random()*10);		//產生0~9亂數 r
		//System.out.println(r);			 	(顯示答案測試)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!(0~9)");
		
		while(true) {							//無窮迴圈，沒猜中就繼續猜
			n = sc.nextInt();					//將猜測的數字指定給 n 存取
			if (n > 9 || n < 0) {				//如果n不在0~9範圍顯示錯誤訊息
				System.out.println("請輸入 0~9");
				continue;						//因為n不在範圍內，不執行下面判斷，直接重新開始迴圈
			}else if(n == r) {					//如果 n=r 代表猜中，break跳出迴圈
				break;
			}else
				System.out.println("猜錯囉~");	//n不等於r 繼續猜
		}
		System.out.println("答對了，答案是 " + r);
	}
}
