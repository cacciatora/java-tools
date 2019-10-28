/*
 * Copyright (C) GSX Techedu Inc. All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Jerax
 * @date 2019/10/28 4:57 PM
 **/
public class JsonUtils {

    private static final ObjectMapper mapper = new ObjectMapper()
            .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public static final String object2Json(Object object) throws JsonProcessingException {
        return mapper.writeValueAsString(object);
    }

    public static final <T> T json2Object(String json, Class<T> valueType) throws IOException {
        return mapper.readValue(json, valueType);
    }

    public static final <T> List<T> json2List(String json, Class<T> valueType) throws IOException {
        return mapper.readValue(json, new TypeReference<List<T>>() {
        });
    }

    public static final JsonNode string2JsonNode(String json) throws IOException {
        return mapper.readTree(json);
    }

    public static final Map<String, Object> string2Map(String json) throws IOException {
        return mapper.readValue(json, new TypeReference<Map<String, Object>>() {
        });
    }
}
