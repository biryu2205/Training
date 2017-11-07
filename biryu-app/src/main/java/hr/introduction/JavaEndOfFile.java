package hr.introduction;

import java.util.Scanner;

public class JavaEndOfFile {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = 0;
    while (scan.hasNext()) {
      String s = scan.nextLine();
      i++;
      System.out.printf("%d %s \n", i, s);
    }
  }
}

