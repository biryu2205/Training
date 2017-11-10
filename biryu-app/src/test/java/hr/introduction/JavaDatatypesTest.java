package hr.introduction;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaDatatypesTest {
  @Test
  public void typeOfXcheck()  {
    assertEquals("byte",JavaDatatypes.typeOfX(Long.valueOf(127)));
    assertEquals("byte",JavaDatatypes.typeOfX(Long.valueOf(-127)));
    assertEquals("short",JavaDatatypes.typeOfX(Long.valueOf(-32700)));
    assertEquals("short",JavaDatatypes.typeOfX(Long.valueOf(25000)));
    assertEquals("int",JavaDatatypes.typeOfX(Long.valueOf(-2147483648)));
    assertEquals("int",JavaDatatypes.typeOfX(Long.valueOf(2147483647)));
    assertEquals("long",JavaDatatypes.typeOfX(9223372036854775807L));
    assertEquals("long",JavaDatatypes.typeOfX(-9223372036854775807L));

  }
}