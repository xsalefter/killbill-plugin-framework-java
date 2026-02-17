package org.jooby.internal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuiltinParserTest {

  @Test
  public void values() {
    assertEquals(5, BuiltinParser.values().length);
  }

  @Test
  public void bytesValueOf() {
    assertEquals(BuiltinParser.Bytes, BuiltinParser.valueOf("Bytes"));
  }

}
