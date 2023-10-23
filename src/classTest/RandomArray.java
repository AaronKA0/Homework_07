package classTest;

public class RandomArray {

	public int[][] getRandomArray() {

		int[][] data = new int[3][3];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++)
				data[i][j] = (int) ((Math.random() * 31));
		}
		return data;
	}

	public void PrintArray(int[][] xyz) {

		for (int i = 0; i < xyz.length; i++) {
			for (int j = 0; j < xyz[i].length; j++)
				System.out.print(xyz[i][j] + "\t");
			System.out.println();
		}
		System.out.println("====================");
	}

	public static void main(String[] args) {

		RandomArray ra = new RandomArray();

		int[][] x = ra.getRandomArray();
		int[][] y = ra.getRandomArray();
		int[][] z = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				z[i][j] = x[i][j] + y[i][j];
		}

		ra.PrintArray(x);
		ra.PrintArray(y);
		ra.PrintArray(z);

	}
}
