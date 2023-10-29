package classtest;

public class PolyAnimal {
	
	public static void main(String[] args) {
		Animal[] e = new Animal[3];
		
		e[0] = new Animal(2, 5.0f);
		e[1] = new Elephant(8, 1200.0f, "大象");
		e[2] = new Elephant(6, 1800.0f, "林旺");
		
		for(int i = 0; i < e.length; i++) {
			e[i].speak();
			System.out.println("=========");
		}
	}
}
