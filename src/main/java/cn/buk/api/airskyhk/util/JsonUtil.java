package cn.buk.api.airskyhk.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import java.time.LocalDateTime;

public class JsonUtil {

  private JsonUtil() {
    throw new RuntimeException("Util class can't be initialized.");
  }

  public static ObjectMapper createObjectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    JavaTimeModule timeModule = new JavaTimeModule();
//    timeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
//    timeModule.addDeserializer(Date.class, new JacksonCustomerDateJsonDeserializer());
    objectMapper.registerModule(timeModule);
//    objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

//    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); // 忽略未知字段

    return objectMapper;
  }

  public static <T> T convertJson2Obj(final String jsonStr, Class<T> tClass) {

    try {
      return createObjectMapper().readValue(jsonStr, tClass);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
      return null;
    }
  }

  public static String toJSONString(Object tClass) {
    try {
      return createObjectMapper().writeValueAsString(tClass);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
      return null;
    }
  }
}
