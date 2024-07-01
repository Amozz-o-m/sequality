package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int SumInRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public float average(int sum, int num) {
    return (float) sum / num;
  }

  public int oddSum(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public int evenSum(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
