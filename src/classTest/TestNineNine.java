package classtest;

//九九乘法表 BOOK(p.44)
public class TestNineNine {
	public static void main(String[] args) {

		int i1, j1, i2, j2, i3, j3;

		System.out.println("======== for + while ========");

		for (i1 = 1; i1 <= 9; i1++) {
			j1 = 1;
			while (j1 <= 9) {
				System.out.print(i1 + "*" + j1 + "=" + i1 * j1 + "\t");
				j1++;
			}
			System.out.println();
		}

		System.out.println("======== for + do...while ========");

		for (i2 = 1; i2 <= 9; i2++) {
			j2 = 1;
			do {
				System.out.print(i2 + "*" + j2 + "=" + i2 * j2 + "\t");
				j2++;
			} while (j2 <= 9);
			System.out.println();
		}
		System.out.println("======== while + do...while ========");

		i3 = 1;
		while (i3 <= 9) {
			j3 = 1;
			do {
				System.out.print(i3 + "*" + j3 + "=" + i3 * j3 + "\t");
				j3++;
			} while (j3 <= 9);
			i3++;
			System.out.println();
		}
	}
}
