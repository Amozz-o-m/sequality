package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAve() {
    Calculate calc = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calc.average(calc.sum(2, 3), 2), 1e-6);
    expected = 5.5;
    assertEquals(expected, calc.average(calc.SumInRange(1, 10), 10), 1e-6);
  }

  @Test
  public void testSumInRange() {
    Calculate calc = new Calculate();
    int expected = 55;
    assertEquals(expected, calc.SumInRange(1, 10));
  }

  @Test
  public void testOddSum() {
    Calculate calc = new Calculate();
    int expected = 25;
    assertEquals(expected, calc.oddSum(1, 10));
    expected = 0;
    assertEquals(expected, calc.oddSum(2, 2));
    expected = 7;
    assertEquals(expected, calc.oddSum(7, 7));
  }

  @Test
  public void testEvenSum() {
    Calculate calc = new Calculate();
    int expected = 30;
    assertEquals(expected, calc.evenSum(1, 10));
    expected = 12;
    assertEquals(expected, calc.oddSum(12, 12));
    expected = 0;
    assertEquals(expected, calc.oddSum(34, 34));
  }
}
