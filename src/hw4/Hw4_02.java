//請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH
//(提示：String方法，陣列)

package hw4;

public class Hw4_02 {
	
	public static void main(String[] args) {

		String s = "Hello World";

		for (int i = 10; i >= 0; i--)
			System.out.print(s.charAt(i));	//i從10~0遞減印出字串
	}
}
