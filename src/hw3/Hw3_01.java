//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形，如圖示結果：
//(提示：Scanner，三角形成立條件，判斷式if else)
//(進階功能：加入直角三角形的判斷)

package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Hw3_01 {
	public static void main(String[] args) {

		int[] t = new int[3];						//設定一個陣列可存放使用者輸入三個邊長數字
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入三個整數: ");

		for (int i = 0; i < t.length; i++) {		//將三個數字依序存放至陣列
			t[i] = sc.nextInt();
		}

		Arrays.sort(t);								//將數字由大到小排列

		if ((t[0] + t[1]) <= t[2]) {				//條件一:如果最小的兩邊相加沒有大於第三邊就不是三角形
			System.out.println("不是三角形");			//此條件為第一條件，確定可成為三角形下面條件才成立
		} else if (t[0] == t[1] && t[1] == t[2]) {	//如果三邊相等則是正三角形
			System.out.println("正三角形");
		} else if (Math.pow(t[0], 2) + Math.pow(t[1], 2) == Math.pow(t[2], 2)) {	//畢氏定理
			System.out.println("直角三角形");
		} else if (t[0] == t[1] || t[0] == t[2] || t[1] == t[2]) {	//如果任兩邊相等為等腰三角形
			System.out.println("等腰三角形");
		} else {									//上面三角形都不是則為其他三角形
			System.out.println("其他三角形");
		}
	}
}
