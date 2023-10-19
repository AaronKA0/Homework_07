//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：
//(提示：Scanner)
//(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

package hw3;

import java.util.Scanner;

public class Hw3_03 {
	public static void main(String[] args) {
		
		int count = 0, hate = 0;
		//int[][] array = new int[7][7];
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("阿文...請輸入你討厭哪個數字: (數字 1~9)");
			hate = sc.nextInt();
			if ( hate > 0 && hate < 10)
				break;
		}
			
		for (int n = 1; n < 50; n++) {
			if (n % 10 == hate || n / 10 == hate)
				continue;
			System.out.print(n + " ");
			count++;
		}
		System.out.println();
		System.out.println("總共有 " + count + " 個數字可選");
	}
}
