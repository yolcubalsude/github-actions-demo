import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertEquals("Test 3 is prime", true, PrimeCheck.isPrime(3));
    assertEquals("Test 7 is prime", true, PrimeCheck.isPrime(7));
    assertEquals("Test 11 is prime", true, PrimeCheck.isPrime(11));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertEquals("Test 4 is not prime", false, PrimeCheck.isPrime(4));
    assertEquals("Test 9 is not prime", false, PrimeCheck.isPrime(9));
    assertEquals("Test 12 is not prime", false, PrimeCheck.isPrime(12));
  }
}
