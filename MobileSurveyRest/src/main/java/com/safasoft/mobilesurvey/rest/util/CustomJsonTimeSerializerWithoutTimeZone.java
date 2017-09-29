package com.safasoft.mobilesurvey.rest.util;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Serializer JSON data with time type and remove timezone if any
 * @author awal
 * @created Mar 18, 2017
 */
public class CustomJsonTimeSerializerWithoutTimeZone extends JsonSerializer<Date> {

  /**
   * Execute time serializing by new process
   * Override default behavior
   * @param d, date to serialize
   * @param jg, json generator
   * @param sp, provider
   * @throws IOException
   * @throws JsonProcessingException 
   */
  @Override
  public void serialize(Date d, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    jg.writeString(format.format(d));
  }

}
