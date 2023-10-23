package classTest;

public class AnimalTest {
	public static void main(String[] args) {

		Animal a = new Animal(2, 5.0f);
		a.speak();
		
//		如果過了三年，體重年齡增加需要修改
		
//  	a.age = 5;			//建構子編譯錯誤
//		a.weight = 8.0f;	//建構子編譯錯誤
		
//		a.Animal(5, 8.0f);	//建構子編譯錯誤
		
//		a = new Animal(5, 8.0f); //不是原本的物件
//		a.speak();
		
//		getter/setter 必要性
		
		a.setAge(5);
		a.setWeight(8.0f);
		a.speak();
	}
}
