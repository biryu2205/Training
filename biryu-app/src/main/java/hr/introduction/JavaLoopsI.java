package hr.introduction;

import java.util.Scanner;

public class JavaLoopsI {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int i = 0;
    int R;
    while (i < 10) {
      i = i + 1;
      R = N * i;
      System.out.print(N + " x " + i + " = " + R);

      System.out.print("\n");
    }
  }
}
