//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)

package hw1;

public class Hw1_02 {
	public static void main(String[] args) {
		int dozen = 200 / 12;
		int egg = 200 % 12;

		System.out.println("200顆蛋共是 " + dozen + "打" + egg + "顆");
	}
}
