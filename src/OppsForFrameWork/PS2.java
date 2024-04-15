package OppsForFrameWork;

public class PS2 extends PS3 {
	
	int a;
	
	public PS2(int a) {
		super(a); // Parent class constructor is invoked
		this.a = a; // This
		
	}
	
	public int increment() {
		a = a+1;
		return a;
	}
	
	public int decremenr() {
		a = a-1;
		return a;
	}

}
