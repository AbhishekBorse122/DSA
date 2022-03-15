//It is a program to find the Chocolate Distribution.(V.Imp)
//It is Efficient solution with O(n) time & space complexity
import java.util.*;
public class Chocolate_Distribution {
  static void distribute(int a[], int m) {
    Arrays.sort(a);
    int diff = 0, min = Integer.MAX_VALUE, n = a.length;
    if (m > n || m == 0 || n == 0) {
      return;
    }
    for (int i = 0; i < n - m + 1; i++) {
      diff = a[m + i - 1] - a[i];
      min = Math.min(min, diff);
    }
    System.out.println("Minimum Diffrence: " + min);
  }

  public static void main(String args[]) {
    int a[] = new int[] { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
    distribute(a, 7);
  }
}