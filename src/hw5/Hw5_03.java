//利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//可以找出二維陣列的最大值並回傳，如圖：

package hw5;

public class Hw5_03 {

	public static void main(String[] args) {

		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		Work03 w = new Work03();	//建立一個work03物件
		System.out.println(w.maxElement(intArray));		//代入int型態引數
		System.out.println(w.maxElement(doubleArray));	//代入double型態引數
	}

}
