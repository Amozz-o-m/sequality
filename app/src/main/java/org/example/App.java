/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    Calculate calc = new Calculate();
    System.out.println(new App().getGreeting());
    int sum = calc.sum(2, 3);
    double ave = calc.average(sum, 2);
    System.out.println("Sum of 2 and 3 is " + sum + ". Average is " + ave + ".");
    sum = calc.SumInRange(1, 10);
    ave = calc.average(sum, 10);
    System.out.println("Sum of 1 and 10 is " + sum + ". Average is " + ave + ".");
    int oddSum = calc.oddSum(1, 10);
    int evenSum = calc.evenSum(1, 10);
    System.out.println("Sum of odd of 1 and 10 is " + oddSum + ". Sum of even is " + evenSum + ".");
  }
}
