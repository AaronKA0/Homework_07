//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
//承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
//型簡化本題的程式設計)

package hw7;

import java.io.*;

public class Hw7_04 {
	
	public static void main(String[] args) throws Exception{
		
		//利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
		File dir = new File("C:\\data");	//建立data資料夾
		dir.mkdir();
		
		File file = new File("C:\\data\\Object.ser");	//建立一個物件
		AnimalSpeak[] animals = new AnimalSpeak[4];		//利用 AniamalSpeak 介面(多型)建立Cat和Dog各兩個物件
		animals[0] = new Cat("喵喵");
		animals[1] = new Cat("喵喵喵");
		animals[2] = new Dog("汪汪");
		animals[3] = new Dog("汪汪汪");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(int i = 0; i < animals.length; i++)	//將animals裡的物件一一輸出到Object.ser
			oos.writeObject(animals[i]);
		
		oos.close();
		fos.close();
		
		//讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while(true) {
				((AnimalSpeak)ois.readObject()).speak();	//一一讀取每個物件speak()方法
			}
		}catch (EOFException e) {
			System.out.println("資料讀取完畢");
		}
		
		ois.close();
		fis.close();
		
	}
}
