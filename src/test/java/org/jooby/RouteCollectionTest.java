package org.jooby;

import java.util.Arrays;

import org.jooby.Route.Collection;
import org.jooby.Route.Definition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RouteCollectionTest {

  @Test
  public void renderer() {
    Collection col = new Collection(new Definition("*", "*", (req, rsp, chain) -> {
    }))
        .renderer("json");

    assertEquals("json", col.renderer());
  }

  @Test
  public void attr() {
    Definition def = new Definition("*", "*", (req, rsp, chain) -> {
    });
    new Collection(def)
        .attr("foo", "bar");

    assertEquals("bar", def.attributes().get("foo"));
  }

  @Test
  public void excludes() {
    Definition def = new Definition("*", "*", (req, rsp, chain) -> {
    });
    new Collection(def)
        .excludes("/path");

    assertEquals(Arrays.asList("/path"), def.excludes());
  }

}
