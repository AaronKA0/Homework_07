//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
//append功能讓每次執行結果都能被保存起來)

package Hw7;

import java.io.*;

public class Hw7_02 {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("C:\\test\\Data.txt", true);	//append=true新增資料附加於原始檔案
			BufferedWriter bw = new BufferedWriter(fw);	
			PrintWriter pw = new PrintWriter(bw);
			
			int r = 0;
			for(int i = 0; i < 10; i++) {			//執行10次亂數
				r = (int)((Math.random()*1000) + 1);//產生 1~1000亂數放入r
				pw.print(r + "	");					//將 r 的值給pw物件寫入
			}	
			pw.println();							//10次亂數結束，寫入換行
			
			pw.close();
			bw.close();
			fw.close();
		
		}catch (IOException e) {}

	}
}
