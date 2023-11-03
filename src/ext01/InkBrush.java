package ext01;

public class InkBrush extends Pen{
	private double inkBrushPrice;
	
	public InkBrush() {
		
	}
	
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public double getPrice() {
		inkBrushPrice = super.getPrice()*0.9;
		return inkBrushPrice;
	}
	
}
