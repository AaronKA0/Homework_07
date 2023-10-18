//請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)

package hw2;

public class Hw2_01 {
	public static void main(String[] args) {
		int sum = 0;
		for (int n = 1; n <= 1000; n++) {
			if (n % 2 == 0)
				sum += n;
		}
		System.out.println("1～1000的偶數和 = " + sum);
	}
}
