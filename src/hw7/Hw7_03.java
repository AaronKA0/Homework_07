//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//代表的檔案會複製到第二個參數代表的檔案

package hw7;

import java.io.*;

public class Hw7_03 {
	
	public static void copyFile(File input, File output) throws IOException{
		
		FileReader fr = new FileReader(input);	//接上讀取低階I/O，建立物件fr
		FileWriter fw = new FileWriter(output); //接上寫入低階I/O，建立物件fw
		
		int i = 0;
		while ( (i = fr.read()) != -1) {	//將fr物件檔案內容讀取放入變數 i
			fw.write((char)i);				//將 i 值再寫入fw物件
			fw.flush();
		}
		
		fw.close();
		fr.close();
	}

	public static void main(String[] args) throws IOException{
		
		File input = new File("C:\\test\\input.txt");	//讀取要被複製的檔案物件
		File output = new File("C:\\test\\output.txt");	//建立要複製的檔案物件
		
		copyFile(input, output);	//將兩個物件做為引數呼叫copyFile方法執行
		
	}
}
