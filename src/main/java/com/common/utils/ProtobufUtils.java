/*
 * Copyright (C) GSX Techedu Inc. All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.common.utils;

import com.google.gson.Gson;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;

/**
 * @author zoujie
 * @description $Description
 * @team wuhan operational dev.
 * @date 2019/12/9 4:23 PM
 **/
public class ProtobufUtils {
    private static final Gson gson = new Gson();

    // proto buff to json
    public static String proto2Json(Message message) throws InvalidProtocolBufferException {
        return JsonFormat.printer().includingDefaultValueFields().print(message);
    }

    // proto buff to pojo
    public static <T> T protobuf2Pojo(Message message, Class<T> clazz) throws Exception {
        final String json = JsonFormat.printer().includingDefaultValueFields().print(message);
        return gson.fromJson(json, clazz);
    }

    // json to proto
    public static <T extends GeneratedMessageV3> T json2Protobuf(GeneratedMessageV3.Builder builder, String json)
        throws InvalidProtocolBufferException {
        JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
        return (T) builder.build();
    }

    // pojo to proto
    public static <T extends GeneratedMessageV3> T pojo2Protobuf(GeneratedMessageV3.Builder builder, Object object)
        throws Exception {
        final String json = gson.toJson(object);
        JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
        return (T) builder.build();
    }
}
