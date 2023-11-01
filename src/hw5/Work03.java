package hw5;

public class Work03 {
	
	public int maxElement(int x[][]) {				//overloading (int 型別)
		int max = 0;
		
		for(int i = 0; i < x.length; i++) {			//將每個元素取出和max比較，比較大的就取代max
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > max)
					max = x[i][j];
			}
		}
		return max;
	}

	public double maxElement(double x[][]) {		//overloading (double 型別)
		double max = 0;
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > max)
					max = x[i][j];
			}
		}
		return max;
	}
}
