//(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_03_plus{
	public static void main(String[] args) {
		
		int count = 0, hate = 0;					//宣告count計數器，hate存放阿文討厭的數字
		int[] a = new int[43];						//宣告a陣列，存放阿文喜歡的數字
		int[] b = new int[6];						//宣告b陣列，存放隨機6個號碼
		int r ;										//宣告r，存放一個隨機亂數
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {								//設定無窮迴圈，直到數字在所訂的範圍內
			System.out.println("阿文...請輸入你討厭哪個數字: (數字 1~9)");
			hate = sc.nextInt();					//將輸入的數字存放到hate
			if ( hate > 0 && hate < 10)				//若數字在0~9則跳出迴圈
				break;
		}
			
		for (int n = 1; n < 50; n++) {				//n從1~49每個數字與hate做運算
			if (n % 10 == hate || n / 10 == hate)	//n%10=hate 可以找出個位數是否=hate
				continue;							//n/10=hate 可以找出十位數是否=hate
			System.out.print(n + " ");				//如果條件符合則continue跳過下面執行
			a[count] = n;
			count++;								//計數器:數字符合+1，計算總個數
		}
		System.out.println();
		System.out.println("總共有 " + (count+1) + " 個數字可選");

		count = 0;									//計數器歸0
		while(count < 6) {							//計數器 < 6，代表陣列b未填滿數字，迴圈繼續
			r = (int)((Math.random()*49)+1);		//1~49產生一個亂數指定給r
			int s1 = Arrays.binarySearch(a, r);		//判斷r是否有存在阿文喜歡的數字(陣列a)內
			int s2 = Arrays.binarySearch(b, r);		//判斷r是否已經存在選出的6個數字(陣列b)內
			
			if (s1 < 0 || s2 > 0) 					//若s1是負數，代表沒有在阿文喜歡的數字內，跳回重新產生亂數 
				continue;							//或者若s2是正數，已經是選過的數字，跳回重新產生亂數
			b[count] = r;							//以上條件不成立代表數字r許可，放到b陣列
			count++;								//計數器+1繼續下一個數字
		}
		
		Arrays.sort(b);								//將陣列b排序後印出
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}
}
