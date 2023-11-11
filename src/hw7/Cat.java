package hw7;

public class Cat implements AnimalSpeak {	//繼承 AnimalSpeak 介面
	private static final long serialVersionUID = 1L; 
	private String name;
	
	public Cat(String name) {
		this.name = name;
		}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
		}
	
}
