//請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡有個自訂
//方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。 CalTest.java執行後，使用者可
//以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
//1. x與y同時為0，(產生自訂的CalException例外物件)
//2. y為負值，而導致x的y次方結果不為整數
//3. x與y皆正確情況下，會顯示運算後結果

package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) throws Exception {
		int x = 0;
		int y = 0;

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);	//宣告在try裡，讓產生異常時，sc回到初值
				System.out.println("請輸入x的值: ");
				x = sc.nextInt();
				System.out.println("請輸入y的值: ");
				y = sc.nextInt();
				Calculator c = new Calculator();
				System.out.println(x + "的" + y + "次方等於: " + c.powerXY(x, y));
				break;
			} catch (CalException ce) {					//CalException例外處理 x,y 同時為0 或 y=0; 
				System.out.println(ce.getMessage());
			} catch (Exception e) {						//處理輸入時非int型態的例外處裡
				System.out.println("格式輸入不正確");
			}
		}

	}
}
