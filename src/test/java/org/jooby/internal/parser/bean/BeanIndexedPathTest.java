package org.jooby.internal.parser.bean;

import org.junit.Test;

import com.google.inject.TypeLiteral;
import com.google.inject.util.Types;

import static org.junit.Assert.assertEquals;

public class BeanIndexedPathTest {

  @Test
  public void rootStr() {
    BeanIndexedPath path = new BeanIndexedPath(null, 0, TypeLiteral.get(Types.listOf(String.class)));
    assertEquals("[0]", path.toString());
  }
}
