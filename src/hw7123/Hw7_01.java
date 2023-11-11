//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

package hw7123;

import java.io.*;

public class Hw7_01 {

	public static void main(String[] args) {
		int countChar = 0, countStr = 0;
		String s;
		
		try {
			File f = new File("C:\\test\\Sample.txt");
			FileReader fr = new FileReader(f);			//低階I/O串接高階I/O
			BufferedReader br = new BufferedReader(fr);	//高階I/O處理String算列數
			
			while ((s = br.readLine()) != null) {	//讀取String物件直到讀完(空值)
				countStr++;							//每次加 1 計算列數
				countChar += s.length();			//每列的字串s字元總數，累加到countChar
			}

			System.out.println("Sample.txt 共 " + f.length() + " 位元組");
			System.out.println("Sample.txt 共 " + countChar + " 個字元");
			System.out.println("Sample.txt 共 " + countStr + " 列資料");

			br.close();
			fr.close();

		} catch (IOException e) {}

	}
}
