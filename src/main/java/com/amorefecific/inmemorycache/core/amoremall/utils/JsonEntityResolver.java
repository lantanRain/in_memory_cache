package com.amorefecific.inmemorycache.core.amoremall.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

@Slf4j
@NoArgsConstructor
public class JsonEntityResolver<T> {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .registerModules(new ParameterNamesModule(), new Jdk8Module(), new JavaTimeModule())
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
            .configure(SerializationFeature.WRITE_DATES_WITH_ZONE_ID, true);


    public String serialize(T t) {
        try {
            return OBJECT_MAPPER.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            log.error("Fail to serialize entity", e);
            throw new IllegalArgumentException(e);
        }
    }

    public T deserialize(String serialized, Class<T> entityClass) {
        if (StringUtils.isBlank(serialized)) {
            return null;
        }
        try {
            return OBJECT_MAPPER.readValue(serialized, entityClass);
        } catch (IOException e) {
            log.error("Fail to deserialize json", e);
            throw new IllegalArgumentException(e);
        }
    }
}
