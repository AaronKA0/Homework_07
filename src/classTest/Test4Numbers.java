package classtest;

//0~100裡4的倍數 BOOK(p.44)
public class Test4Numbers {
	public static void main(String[] args) {
		//for
		for(int i=0;i<=100;i++) {
			if(i % 4 ==0)
				System.out.print(i + " ");
		}
		
		System.out.println();
		
		//while
		int j=0;
		while(j <= 100) {
			if(j % 4 == 0)
				System.out.print(j + " ");
			j++;
		}
		
		System.out.println();
		
		//do..while
		int n=0;
		do {
			if(n % 4 ==0)
				System.out.print(n +" ");
			n++;
		}while(n<=100);
	}
}
