package ext01;

public class Pencil extends Pen{
	private double pencilPrice;
	
	public Pencil() {
		
	}
	
	public Pencil(String brand, double price) {
		super(brand, price);
	}
	
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public double getPrice() {
		pencilPrice = super.getPrice()*0.8;
		return pencilPrice;
	}
	
}
