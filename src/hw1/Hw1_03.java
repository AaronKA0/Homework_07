//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

package hw1;

public class Hw1_03 {
	public static void main(String[] args) {
		int s = 256559 % 60;
		int m = (256559 / 60) % 60;
		int h = ((256559 / 60) / 60) % 24;
		int d = ((256559 / 60) / 60) / 24;

		System.out.println("256559秒 = " + d + "天 " + h + "小時 " + m + "分 " + s + "秒");
	}
}
