package duo.Fraction;

import org.junit.*;
import static org.junit.Assert.*;


public class FractionTest
{

  //Test de fonctionnement normal
  @Test
  public void TestInitI(){
    Fraction testFrac = new Fraction(1, 1);
    assertNotNull("L'objet n'existe pas \n", testFrac);
  }

  @Test(expected = IllegalArgumentException.class)
  public void TestInitI2(){
    Fraction testFrac = new Fraction(1, 0);

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
	@Test
	public void toStringTest() {
		Fraction test =  new Fraction(1,2);
		assertTrue(test.toString().equals("Fraction num=1, den=2 "));
	
	}
}
