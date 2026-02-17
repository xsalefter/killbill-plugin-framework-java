package org.jooby.issues;

import org.jooby.Route.Mapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Issue384 {

  static class M implements Mapper<Integer> {

    @Override
    public Object map(final Integer value) throws Throwable {
      return value;
    }

  }

  @Test
  public void defaultRouteMapperName() {
    Mapper<Integer> intMapper = (final Integer v) -> v * 2;
    assertTrue(intMapper.name().startsWith("issue384"));

    assertEquals("m", new M().name());

    assertTrue(new Mapper<String>() {
      @Override
      public Object map(final String value) throws Throwable {
        return value;
      };
    }.name().startsWith("issue384"));
  }

  @Test
  public void routeFactory() {
    Mapper<Integer> intMapper = Mapper.create("x", (final Integer v) -> v * 2);
    assertEquals("x", intMapper.name());
    assertEquals("x", intMapper.toString());
  }

  @Test
  public void chain() throws Throwable {
    Mapper<Integer> intMapper = Mapper.create("int", (final Integer v) -> v * 2);
    Mapper<String> strMapper = Mapper.create("str", v -> "{" + v + "}");
    assertEquals("int>str", Mapper.chain(intMapper, strMapper).name());
    assertEquals("str>int", Mapper.chain(strMapper, intMapper).name());
    assertEquals(8, Mapper.chain(intMapper, intMapper).map(2));
  }
}
