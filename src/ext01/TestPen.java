package ext01;

public class TestPen {

	public static void main(String[] args) {
		
		Pen[] p = new Pen[2];
		
		p[0] = new Pencil("Pencil Pen", 30);
		p[1] = new InkBrush("InkBrush Pen", 80);
		
		for (int i = 0; i < p.length; i++) {
			p[i].write();
			System.out.println("$ " + p[i].getPrice());
		}
		
	}
}
