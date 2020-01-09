package com.common.utils;

import com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.ReaderInputStream;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

/**
 * @author Jerax
 * @date 2020/1/8
 **/
public class InputStreamUtils {

    // java InputStream to String
    public static String streamToString(InputStream inputStream) throws IOException {
        return IOUtils.toString(inputStream, StandardCharsets.UTF_8);
    }

    // java String to InputStream
    public static InputStream stringToStream(String string) {
        return new ByteArrayInputStream(string.getBytes());
    }

    // java InputStream to byte array
    public static byte[] streamToByteArray(InputStream inputStream) throws IOException {
        return IOUtils.toByteArray(inputStream);
    }

    // java byte array to InputStream
    public static InputStream byteArrayToStream(byte[] byteArray) {
        return new ByteArrayInputStream(byteArray);
    }

    // java InputStream to ByteBuffer
    public static ByteBuffer streamToByteBuffer(InputStream inputStream) throws IOException {
        final byte[] byteArray = IOUtils.toByteArray(inputStream);
        final ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        return byteBuffer.get(byteArray);
    }

    // java ByteBuffer to InputStream
    public static InputStream byteBufferToStream(ByteBuffer byteBuffer) {
        return new ByteBufferBackedInputStream(byteBuffer);
    }

    // java InputStream to Reader
    public static Reader streamToReader(InputStream inputStream) {
        return new InputStreamReader(inputStream);
    }

    // java InputStream to OutStream

    public static void writeInputToOutput(InputStream in, OutputStream out)throws IOException {
        IOUtils.copy(in, out);
    }

    // java Reader to InputStream
    public static InputStream readerToStream(Reader reader) {
        return new ReaderInputStream(reader, StandardCharsets.UTF_8);
    }

    // java InputStream to File
    public static File streamToFile(InputStream inputStream) throws IOException {
        final File output = new File("classpath:output.txt");
        FileUtils.touch(output);
        FileUtils.writeByteArrayToFile(output, IOUtils.toByteArray(inputStream));
        return output;
    }

    // java File to InputStream
    public static InputStream fileToStream(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    // java InputStream to Resource
    public static Resource streamToResource(InputStream inputStream) throws IOException {
        return new ByteArrayResource(IOUtils.toByteArray(inputStream));
    }

    // java Resource to InputStream
    public static InputStream stringToStream(Resource resource) throws IOException {
        return resource.getInputStream();
    }

}
