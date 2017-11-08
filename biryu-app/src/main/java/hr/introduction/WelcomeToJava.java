package hr.introduction;

public class WelcomeToJava {
  public static String printHello1() {
    String str1;
    str1 = "Hello, World.";
    return str1;
  }

  public static String printHello2() {
    String str2;
    str2 = "Hello, Java.";
    return str2;
  }

  public static void main(String[] args) {
    System.out.println(printHello1());
    System.out.println(printHello2());
  }
}

