// 請設計一個Train類別，並包含以下屬性：
// - 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
// - 目的地 dest，型別為String - 票價 price，型別為double
//設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
//需使用的集合裡
// - (202, “普悠瑪”, “樹林”, “花蓮”, 400)
// - (1254, “區間”, “屏東”, “基隆”, 700)
// - (118, “自強”, “高雄”, “台北”, 500)
// - (1288, “區間”, “新竹”, “基隆”, 400)
// - (122, “自強”, “台中”, “花蓮”, 600)
// - (1222, “區間”, “樹林”, 七堵, 300)
// - (1254, “區間”, “屏東”, “基隆”, 700)
// 請寫一隻程式，能印出不重複的Train物件
// 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
// 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
// (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)

package hw8123;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hw8_02 {

	public static void main(String[] args) {
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		// 請寫一隻程式，能印出不重複的Train物件
		System.out.println("--------------  印出不重複的Train物件  --------------");
		Set<Train> hSet = new HashSet<Train>();
		hSet.add(t1);
		hSet.add(t2);
		hSet.add(t3);
		hSet.add(t4);
		hSet.add(t5);
		hSet.add(t6);
		hSet.add(t7);
		
		System.out.println("============== Iterator ==============");
		Iterator<Train> hSetTrains = hSet.iterator();
		while (hSetTrains.hasNext()) {
			Train train = hSetTrains.next();
			train.show();
		}
		
		System.out.println("============== for each ==============");
		for (Train tr : hSet) {
			tr.show();
		}
		
		System.out.println();
		
		// 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		System.out.println("--------------  以班次編號由大到小印出Train物件  --------------");
		List<Train> list = new ArrayList<Train>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		
		Collections.sort(list);

		System.out.println("============== Iterator ==============");
		Iterator<Train> listTrains = list.iterator();
		while (listTrains.hasNext()) {
			Train train = listTrains.next();
			train.show();
		}
		
		System.out.println("==============   for    ==============");
		for (int i = 0; i < list.size(); i++) {
			Train tr = list.get(i);
			tr.show();
		}
		
		System.out.println("============== for each ==============");
		for (Train tr : list) {
			tr.show();
		}
		
		System.out.println();
		
		// 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		System.out.println("--------------  班次編號由大到小&不重複印出Train物件  --------------");
		TreeSet<Train> tSet = new TreeSet<Train>();
		tSet.add(t1);
		tSet.add(t2);
		tSet.add(t3);
		tSet.add(t4);
		tSet.add(t5);
		tSet.add(t6);
		tSet.add(t7);
		
		System.out.println("============== Iterator ==============");
		Iterator<Train> tSetTrains = tSet.iterator();
		while (tSetTrains.hasNext()) {
			Train train = tSetTrains.next();
			train.show();
		}
		
		System.out.println("============== for each ==============");
		for (Train tr : tSet) {
			tr.show();
		}
	}
}
