//請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)

package hw2;

public class Hw2_03 {
	public static void main(String[] args) {
		int i = 1, p = 1;
		while (i <= 10) {
			p *= i;
			i++;
		}
		System.out.println("1*2*3*…*10 = " + p);
	}
}
