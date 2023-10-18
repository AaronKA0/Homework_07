//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長

package hw1;

public class Hw1_04 {
	public static void main(String[] args) {
		final double PI = 3.1415;
		int r = 5;
		double a = r * r * PI;
		double p = r * 2 * PI;

		System.out.println("圓面積: " + a);
		System.out.println("圓周長: " + p);
	}
}
