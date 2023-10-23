package classTest;

//計算自己的BMI並判斷 BOOK(p.39)
public class TestBMI {
	public static void main(String[] args) {
		double h=1.7;
		double w=60;
		
		double b = w / Math.pow(h, 2);
		System.out.printf("BMI = %.2f\n" , b);
		
		if (b < 18.5) {
			System.out.println("過瘦");
		}else if(b >= 24) {
			System.out.println("過胖");
		}else {
			System.out.println("正常");
		}
	}
}
