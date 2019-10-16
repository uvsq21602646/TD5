package duo.Fraction;

import org.junit.*;
import static org.junit.Assert.*;

public class FractionTest 
{
	
   @Test
  public void TestInitI(){

  }
  
	@Test
	public void testInit2() {
		Fraction test = new Fraction(6);
		assertNotNull(test);
	}
	@Test
	public void testInit3() {
		Fraction test = new Fraction();
		assertNotNull(test);
	}

}
