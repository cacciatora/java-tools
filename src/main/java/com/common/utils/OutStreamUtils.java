package com.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

/**
 * @author Jerax
 * @date 2020/1/9
 **/
public class OutStreamUtils {

    // java write String to OutputStream
    public static void writeStringToOutStream(String string, OutputStream out) throws IOException {
        out.write(string.getBytes());
    }

    // java write byte array to OutputStream
    public static void writeByteArrayToOutStream(byte[] byteArray, OutputStream out)
            throws IOException {
        out.write(byteArray);
    }

    // java write inputStream to outputStream
    public static void writeInputStreamToOutStream(InputStream in, OutputStream out)
            throws IOException {
        IOUtils.copy(in, out);
    }

    // java write Reader to outputStream
    public static void writeReaderToOutStream(Reader reader, OutputStream out)
            throws IOException {
        IOUtils.copy(reader, out, StandardCharsets.UTF_8);
    }

    // java write File to outputStream
    public static void writeFileToOutStream(File file, OutputStream out)
            throws IOException {
        IOUtils.copy(new FileInputStream(file), out);
    }
}
