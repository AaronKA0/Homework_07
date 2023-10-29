//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//(提示1：Scanner，陣列)
//(提示2：需將閏年條件加入)
//(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

package hw4;

import java.util.Scanner;

public class Hw4_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	//每個元素代表月份最大天數
		int yy = 0, mm = 0, dd = 0;
		int sum = 0, num = 0;

		System.out.println("請輸入三組數字，代表西元 年,月,日");

		while (true) {
			yy = sc.nextInt();		//第一個輸入數字代表年份yy
			mm = sc.nextInt();		//第二個輸入數字代表年份mm
			dd = sc.nextInt();		//第三個輸入數字代表年份dd
			
			//判斷閏年(被4整除但不被100整除 or 同時被4、100、400整除)
			if (yy % 4 == 0) {
				if ((yy % 100 != 0) || (yy % 100 == 0 && yy % 400 == 0)) {
					day[1] = 29;	//條件成立，將2月的天數(day[1])改為29
					System.out.println("(註: 這年是閏年)");
				}else
					System.out.println("(註: 這年不是閏年)");
			}else
				System.out.println("(註: 這年不是閏年)");

			//判斷年月日輸入正確性
			if (yy <= 0 || mm <= 0 || dd <= 0) {			//年月日其中之一沒有大於0，重新輸入
				System.out.println("請輸入大於0的年月日");
				continue;
			} else if (mm <= 0 || mm > 12) {				//月份沒有在1~12範圍，重新輸入
				System.out.println("月份輸入錯誤，請重新輸入");
				continue;
			} else if (dd > day[mm - 1]) {					//日期大於該月份的最大天數，重新輸入
				System.out.println("日期輸入錯誤，請重新輸入");
				continue;
			} else
				break;
		}

		//以上條件都通過，天數加總
		for (int i = 0; i < (mm - 1); i++)
			sum += day[i];		//將輸入日期該年的前面月份天數累加放入sum
		num = sum + dd;			//前面所有月份的天數加上該月要調查的日期，算出該年的第幾天
		System.out.println("輸入的日期為該年第" + num + "天");

	}

}
