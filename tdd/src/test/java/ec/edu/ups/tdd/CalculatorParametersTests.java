package ec.edu.ups.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTests {

  private int a, b, expected;

  @Parameterized.Parameters
  public static Iterable<Object[]> parameters(){
    List <Object[]> objects = new ArrayList<Object[]>();
    objects.add(new Object[]{2, 4, 6});
    objects.add(new Object[]{1, 8, 9});
    objects.add(new Object[]{2, 5, 7});
    objects.add(new Object[]{3, 7, 12});
    objects.add(new Object[]{22, 4, 26});
    return objects;
  }

  public CalculatorParametersTests(int a, int b, int expected){
    this.a = a;
    this.b = b;
    this.expected = expected;
  }

  @Test
  public void test_addition() {
    Calculator c = new Calculator();
    int actual = c.addition(a, b);
    assertEquals(expected, actual);
	}

}
