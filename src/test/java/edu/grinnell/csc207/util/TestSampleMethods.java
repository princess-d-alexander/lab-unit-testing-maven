package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Princess Alexander
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  // void sampleFailingTest() {
  //   assertEquals(2, 3);
  // } // sampleFailingTest()


  // Test for Celsius to Fahrenheit conversion
  @Test
  public void testC2F() {
      assertEquals(32, SampleMethods.c2f(0), "Celcius to Farenheit conversion at 0° C");
      assertEquals(212, SampleMethods.c2f(100), "Celcius to Farenheit conversion at 100°C");
  }

  // Test for sum method
  @Test
  public void testSum() {
      int[] values = {1, 2, 3};
      assertEquals(6, SampleMethods.sum(values), "Sum of {1, 2, 3} should be 6");

      int[] largeValues = {Integer.MAX_VALUE - 1, 1};
      assertEquals(Integer.MAX_VALUE, SampleMethods.sum(largeValues), "Sum of extreme values");
  }

  // Test for extreme sums to ensure integer overflow is handled correctly
  @Test
  public void testExtremes() {
      int tmp = Integer.MAX_VALUE - 10;
      int[] values = {tmp, tmp, -tmp, -tmp};
      // This test checks for integer overflow
      assertEquals(0, SampleMethods.sum(values), "Sum of extreme values");
    }

} // class TestSampleMethods


