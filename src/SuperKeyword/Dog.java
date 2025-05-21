package SuperKeyword;

public class Dog extends Animal {
	//https://www.geeksforgeeks.org/super-keyword/
	
	
	public Dog() {
		super(12);
		System.out.println("Dog contructor");
	}

	public void sound() {
		
		super.sound();
		System.out.println("child -Sound");
	}
}
