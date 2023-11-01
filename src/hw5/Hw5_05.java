//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合，如圖：	
//					本次隨機產生驗證碼為：
//						GLSe3X81

package hw5;

import java.util.Arrays;

public class Hw5_05 {
	
	public static char[] getAuthCode() {	//方法：使用ASCII印出48~122(十進位)的字元(排除不是數字或英文的符號)
		int[] noPrint = {58, 59, 60, 61, 62, 63, 64, 91, 92, 93, 94, 95, 96}; //代表不是英文數字的ASCII編碼
		char[] ac = new char[8];
		int r = 0, count = 0;
		
		Arrays.sort(noPrint);	//需要使用binarySearch先進行排序
		
		while(count < 8) {		//產生8次隨機值r
			r = (int)((Math.random()*75) + 48);
			if((Arrays.binarySearch(noPrint, r)) >= 0)	//如果r在noPrint陣列裡(正數)，代表不是英文或數字
				continue;								//continue重新產生一次
			ac[count] = (char)r;						//if不成立，代表是英文或數字，轉成char字元放入ac陣列
			count++;									//往下一個ac元素
		}
		return ac;										//ac八個元素完成return
	}
	
	public static void main(String[] args) {
		
		System.out.println("本次隨機產生驗證碼為：");
		System.out.print(getAuthCode());
	}
}
