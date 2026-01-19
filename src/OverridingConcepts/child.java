package OverridingConcepts;

public class child extends Parent {
	
	
	public void show() {
		System.out.println("From child");
	}
	
	public void display() {
		System.out.println("From child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Parent c = new child();
    c.show();
    //c.display()://--will give erroe, with parent referene we can not access the child
    	// class method
    
    /*
     * Ques--Can we change the access modifier when overriding?
     * Ans-- yes, we can  but we cannot reduce the visibility.
     * 
     * If menthod in parent class is default-- then access modifier of this method
     * can be change to default, proctect and public but not private.
     * 
     * Ques-  can we override static method?
     * Ans -- NO (this is also known as method hiding)
     * 
     * */
    
	}

}
