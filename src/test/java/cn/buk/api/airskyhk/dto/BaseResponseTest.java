package cn.buk.api.airskyhk.dto;

import org.junit.jupiter.api.Disabled;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Disabled
public class BaseResponseTest {


  protected String getTemplateContent(final String fileName) throws Exception {
    InputStream inputStream = getClass().getResourceAsStream(fileName);
    assertNotNull(inputStream, "Test file missing." + fileName);

    int length = inputStream.available();
    byte bytes[] = new byte[length];
    inputStream.read(bytes);
    inputStream.close();
    String str = new String(bytes, StandardCharsets.UTF_8);

    return str;
  }

}
