//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形，如圖示結果：
//(提示：Scanner，三角形成立條件，判斷式if else)
//(進階功能：加入直角三角形的判斷)

package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Hw3_01 {
	public static void main(String[] args) {
		
		int[] t = new int[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入三個整數: ");
		
		for (int i = 0; i < t.length; i++) {
			t[i] = sc.nextInt();
		}
		
		Arrays.sort(t);
		
		if ((t[0] + t[1]) <= t[2]) {
			System.out.println("不是三角形");
		}else if(t[0] == t[1] && t[1] == t[2]){
			System.out.println("正三角形");
		}else if(t[0] == t[1] || t[0] == t[2] || t[1] == t[2]){
			System.out.println("等腰三角形");
		}else {
			System.out.println("其他三角形");
		}
		
	}
}
