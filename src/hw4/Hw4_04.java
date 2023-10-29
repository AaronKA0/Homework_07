//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下：
//	員工編號	25		32		8		19		27
//	身上現金	2500	800		500		1000	1200
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
//(提示：Scanner，二維陣列)

package hw4;

import java.util.Scanner;

public class Hw4_04 {

	public static void main(String[] args) {

		int[][] a = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		int count = 0, need = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入想借的金額: ");
		while (true) {								//若借款金額 < 0，迴圈繼續，請使用者重新輸入
			need = sc.nextInt();
			if (need > 0)							//輸入金額 > 0，跳出迴圈
				break;
			System.out.println("請輸入大於0的金額");
		}

		System.out.println("有錢可借的員工編號: ");
		for (int i = 0; i < a[1].length; i++) {		//取出每個金額元素
			if (a[1][i] >= need) {					//若第i人的金額大於使用者輸入金額
				System.out.print(a[0][i] + " ");	//就印出第i人的員工編號
				count++;							// 計數器計算共幾人
			}
		}
		System.out.println("共 " + count + " 人");

	}
}
