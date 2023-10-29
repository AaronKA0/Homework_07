//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因

package hw1;

public class Hw1_06 {
	public static void main(String[] args) {

		int num = 5;
		char a = '5';
		String w = "5";

		System.out.println(num + num);	// 宣告num是整數5,一般數學運算5+5=10
		System.out.println(num + a);	// 字元5的Unicode編碼是0035(十六進位),轉換為十進位=53,因此5+53=58
		System.out.println(num + w);	// 宣告w=5是字串,因此加法是文字串接55
	}
}
