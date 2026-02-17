package org.jooby;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;

import org.jooby.Cookie.Signature;
import org.jooby.test.MockUnit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertEquals;

@PowerMockIgnore("javax.crypto.*")
@RunWith(PowerMockRunner.class)
public class CookieSignatureTest {

  @Test
  public void sillyJacoco() throws Exception {
    new Signature();
  }

  @Test
  public void sign() throws Exception {
    assertEquals("qAlLNkSRVE4aZb+tz6avvkVIEmmR30BH8cpr3x9ZdFA|jooby",
        Signature.sign("org.jooby", "124Qwerty"));
  }

  @Test(expected = IllegalArgumentException.class)
  @PrepareForTest({Cookie.class, Signature.class, Mac.class })
  public void noSuchAlgorithmException() throws Exception {
    new MockUnit()
    .expect(unit -> {
      unit.mockStatic(Mac.class);
      expect(Mac.getInstance("HmacSHA256")).andThrow(new NoSuchAlgorithmException("HmacSHA256"));
    })
    .run(unit -> {
      Signature.sign("org.jooby", "a11");
    });
  }

  @Test
  public void unsign() throws Exception {
    assertEquals("org.jooby",
                 Signature.unsign("qAlLNkSRVE4aZb+tz6avvkVIEmmR30BH8cpr3x9ZdFA|jooby", "124Qwerty"));
  }

  @Test
  public void valid() throws Exception {
    assertEquals(true,
        Signature.valid("qAlLNkSRVE4aZb+tz6avvkVIEmmR30BH8cpr3x9ZdFA|jooby", "124Qwerty"));
  }

  @Test
  public void invalid() throws Exception {
    assertEquals(false,
        Signature.valid("QAlLNkSRVE4aZb+tz6avvkVIEmmR30BH8cpr3x9ZdFA|jooby", "124Qwerty"));

    assertEquals(false,
        Signature.valid("qAlLNkSRVE4aZb+tz6avvkVIEmmR30BH8cpr3x9ZdFA|joobi", "124Qwerty"));

    assertEquals(false,
        Signature.valid("#qAlLNkSRVE4aZb+tz6avvkVIEmmR30BH8cpr3x9ZdFA#joobi", "124Qwerty"));
  }

}
