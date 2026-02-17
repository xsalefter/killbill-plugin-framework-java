package org.jooby.internal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuiltinRendererTest {

  @Test
  public void values() {
    assertEquals(9, BuiltinRenderer.values().length);
  }

  @Test
  public void bytesValueOf() {
    assertEquals(BuiltinRenderer.bytes, BuiltinRenderer.valueOf("bytes"));
  }

}
