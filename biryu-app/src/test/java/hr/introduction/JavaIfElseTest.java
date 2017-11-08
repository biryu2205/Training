package hr.introduction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaIfElseTest {
  @Test
  public static void weirddOrNotCorrectly() {
    assertEquals("Weird", JavaIfElse.weirdOrNot(1));
    assertEquals("Weird", JavaIfElse.weirdOrNot(8));
    assertEquals("Not Weird", JavaIfElse.weirdOrNot(4));
    assertEquals("Not Weird", JavaIfElse.weirdOrNot(22));
  }
}