//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
//本次亂數結果：
//	32	35	15	12	81	28	20	45	40	21
//	32

package hw5;

public class Hw5_02 {
	
	public static void randAvg() {
		int r = 0;
		int sum = 0, avg = 0; 
			
		for(int i = 0; i < 10; i++) {			//印出10個數字
			r = (int)(Math.random()*101);		//產生隨機亂數r
			System.out.print(r + " ");
			sum += r;							//每次跑出亂數加總
		}
		
		avg = sum / 10;							//算出平均
		System.out.println("\n平均: " + avg);
	}
	
	public static void main(String[] args) {
		
		System.out.println("本次亂數結果: ");
		randAvg();								//呼叫randAvg()
	}

}
