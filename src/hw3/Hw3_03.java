//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：
//(提示：Scanner)
//(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

package hw3;

import java.util.Scanner;

public class Hw3_03 {
	public static void main(String[] args) {
		
		int count = 0, hate = 0;					//宣告count存放總共幾個數字可選，hate存放阿文討厭的數字
		
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
			count++;								//計數器符合+1，計算總個數
		}
		System.out.println();
		System.out.println("總共有 " + count + " 個數字可選");
	}
}
