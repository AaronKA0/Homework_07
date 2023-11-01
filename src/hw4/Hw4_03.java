//有個字串陣列如下 (八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示：字元比對，String方法)

package hw4;

import java.util.Arrays;

public class Hw4_03 {
	
	public static void main(String[] args) {

		String[] s = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		String v = "aeiou";
		int count = 0;
		int[] a = new int[5];

		for (int i = 0; i < v.length(); i++) {							//將v字串每個字元轉成int放入a陣列
			a[i] = v.charAt(i);
		}
		Arrays.sort(a);													//呼叫binarySearch前，先將a陣列排序
		
		for (int i = 0; i < 8; i++) {									//依序取出字串
			for (int j = 0; j < s[i].length(); j++) {					//依序取出字串中的字元
				int x = Arrays.binarySearch(a, (int) s[i].charAt(j));	//判斷取出的字元是否在a陣列裡
				if (x >= 0) {											//正數代表是aeiou其中之一
					System.out.print(s[i].charAt(j) + " ");
					count++;											//計算共幾個母音
				}
			}
		}
		System.out.println("\n" + "總共:" + count + " 個母音");
	}
}
