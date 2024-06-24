package ec.edu.ups.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTests {

  private static final String expected = null;
  Calculator c = null;

  @Before
	public void setUp() {
    c = new Calculator();
    System.out.println("setUp()");
	}

  @Test
	public void test_addition() {
    assertEquals(6, c.addition(4, 2));
    System.out.println("Test1");
	}

  @Test
	public void test_subtraction() {
    assertEquals(3, c.subtraction(4, 2));
    System.out.println("Test2");
	}

  @Test(expected = ArithmeticException.class)
  //@Test
	public void test_division() {
    assertEquals(0, c.division(4, 0));
    System.out.println("Test3");
	}

  @Test(timeout = 50)
  //@Test
	public void test_multiplication() {
    assertEquals(8, c.multiplication(4, 2));
    System.out.println("Test4");
	}

  @After
  public void tearDown(){
    System.out.println("tearDown()");
    c.setAns(0);
    c = null;
  }

}
