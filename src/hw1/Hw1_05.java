//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，
//本金加利息共有多少錢 (用複利計算，公式請自行google)
//複利公式: 本利和 = 本金 × (1 + 年利率)^期間

package hw1;

public class Hw1_05 {
	public static void main(String[] args) {
		
		double fv = 0;				// 設定本金和fv初始值
		double pv = 1_500_000;		// 本金 1,500,000
		double i = 1.02;			// 設定 i=(1+年利率2%)
		double sum = 1;				// 設定sum初始值1

		for (int n = 0; n < 10; n++)
			sum *= i;				// sum=(1 + 年利率)^期間

		fv = pv * sum;				// 本利和 = 本金 × sum

		System.out.println("本金150萬, 年利率2%, 10年後本金加利息 = $" + fv);
	}
}
