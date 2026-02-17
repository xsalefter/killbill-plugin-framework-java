package org.jooby;

import org.jooby.Jooby.MvcClass;
import org.jooby.Route.Definition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MvcClassTest {

  @Test
  public void rendererAttr() throws Exception {
    MvcClass mvcClass = new MvcClass(MvcClassTest.class, "/", null);
    mvcClass.renderer("text");
    assertEquals("text", mvcClass.renderer());
    Definition route = new Definition("GET", "/", (req, rsp, chain) -> {
    });
    mvcClass.apply(route);
    assertEquals("text", route.renderer());
  }
}
