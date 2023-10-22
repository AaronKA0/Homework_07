//進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案

package hw3;

import java.util.Scanner;

public class Hw3_02_plus {

	public static void main(String[] args) {

		int n;										//宣告n用於放入猜測的數值
		int r = (int) (Math.random() * 101);		//產生0~100亂數 r
		//System.out.println(r);					(顯示答案測試)

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!(0~100)");

		while (true) {								//無窮迴圈，沒猜中就繼續猜
			n = sc.nextInt();						//將猜測的數字指定給 n 存取
			if (n > 100 || n < 0) {					//如果n不在0~100範圍顯示錯誤訊息
				System.out.println("請輸入 0~100");
				continue;							//因為n不在範圍內，不執行下面判斷，直接重新開始迴圈
			} else if (n == r) {					//如果 n=r 代表猜中，break跳出迴圈
				break;
			} else if (n > r) {						//判斷猜測的數字n如果比較大
				System.out.println("答錯囉，比 " + n + " 小");	//告知要再猜小一點
				continue;
			} else {								//反之就告知要再猜大一點
				System.out.println("答錯囉，比 " + n + " 大");
			}
		}
		System.out.println("答對了，答案是 " + r);
	}
}