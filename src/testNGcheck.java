import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGcheck {

	@Test
	public void print() {
		System.out.println("Present");
		Assert.assertEquals(false, null);
	}
}
