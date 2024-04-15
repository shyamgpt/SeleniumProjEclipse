package OppsForFrameWork;

import org.testng.annotations.Test;

public class PS1 extends PS {
	
	@Test
	public void testRun() {
		int a1 =3;
		PS2 ps2 = new PS2(a1);
		System.out.println(ps2.increment());
		System.out.println(ps2.decremenr());
		System.out.println(ps2.multiplyThree());
		
	}
	
	

}
