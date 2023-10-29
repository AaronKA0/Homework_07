//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示：陣列，length屬性)

package hw4;

import java.util.Arrays;

public class Hw4_01 {
	
	public static void main(String[] args) {

		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };	//宣告a陣列，放入數值
		int sum = 0, avg = 0; 									//宣告sum存放元素總和
																//宣告avg存放總平均值
		Arrays.sort(a); 										//將陣列升冪排序(可省略)
		for (int i = 0; i < a.length; i++) { 					//將元素累加放入sum
			sum += a[i];
		}

		avg = sum / a.length;									//算出平均值
		System.out.println("平均值: " + avg);
		System.out.print("大於平均值的元素: ");

		for (int i = 0; i < a.length; i++) {					//比較大小，比平均值小略過，比較大則印出
			if (a[i] < avg)
				continue;
			System.out.print(a[i] + " ");
		}
	}
}
