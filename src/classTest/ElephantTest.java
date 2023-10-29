package classtest;

public class ElephantTest {
	public static void main(String[] args) {
		
		Animal a = new Animal(3, 8.0f);
		Elephant e = new Elephant(8, 1200.0f, "大象");
		
		a.speak();
		e.speak();
	}
}
