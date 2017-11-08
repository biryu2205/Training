package hr.introduction;

import org.junit.Test;

import static hr.introduction.WelcomeToJava.printHello1;
import static hr.introduction.WelcomeToJava.printHello2;
import static org.junit.Assert.assertEquals;

public class WelcomeToJavaTest {
  @Test
  public void printHello1iscorrect() {
    assertEquals("Hello, World.", printHello1());
  }

  @Test
  public void printHello2iscorrect() {
    assertEquals("Hello, Java.", printHello2());
  }
}