package classTest;

// BOOK(p.53)
public class Student {
	
	int score = 90;
	
	public void play(int hours) {
		score-=hours;
	}
	
	public void study(int hours) {
		score+=hours;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.play(5);
		s1.study(2);
		System.out.println("s1學生 score: " + s1.score);
		
		s2.study(6);
		s2.play(1);
		System.out.println("s2學生 score: " + s2.score);
		
	}
}
