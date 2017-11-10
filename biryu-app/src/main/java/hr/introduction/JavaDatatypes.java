package hr.introduction;

import java.util.Scanner;

public class JavaDatatypes {
  public static void main(String[] argh) {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      try {
        long x = sc.nextLong();
        System.out.println(String.format("%d can be fitted in: %s", x, typeOfX(x)));
      } catch (Exception e) {
        System.out.println(sc.next() + " can't be fitted anywhere.");
      }
    }
  }

  // test this function with value of x.
  static String typeOfX(Long x) {
    if (x >= -128 && x <= 127) {
      return "byte";
    }

    if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
      return "short";
    }

    if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
      return "int";
    }

    return "long";
  }
}

