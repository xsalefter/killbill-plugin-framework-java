package org.jooby.issues;

import org.jooby.MediaType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Issue197 {

  @Test
  public void shouldParseOddMediaType() {
    MediaType type = MediaType.parse("*; q=.2").iterator().next();
    assertEquals("*/*", type.name());
  }
}
