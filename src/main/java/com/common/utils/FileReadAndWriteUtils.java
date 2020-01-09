package com.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * @author Jerax
 * @date 2020/1/9
 **/
public class FileReadAndWriteUtils {

    // file to String
    public static String fileToString(File file) throws IOException {
        return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
    }

    // file to List<String>
    public static List<String> fileToList(File file) throws IOException {
        return FileUtils.readLines(file, StandardCharsets.UTF_8);
    }

    // file to byte array
    public static byte[] fileToByteArray(File file) throws IOException {
        return FileUtils.readFileToByteArray(file);
    }

    // file to InputStream
    public static InputStream fileToStream(File file) throws IOException {
        return new FileInputStream(file);
    }

    // String to file tail
    public static void stringToFile(String string) throws IOException {
        final File output = new File("classpath:output.txt");
        FileUtils.touch(output);
        FileUtils.writeStringToFile(output, string, StandardCharsets.UTF_8, true);
    }

    // List<String> to file tail
    public static void listToFile(List<String> stringList) throws IOException {
        final File output = new File("classpath:output.txt");
        FileUtils.touch(output);
        FileUtils.writeLines(output, "UTF-8", stringList, true);
    }

    // byte array to file
    public static void byteArrayToFile(byte[] byteArray) throws IOException {
        final File file = new File("classpath:output.txt");
        FileUtils.touch(file);
        FileUtils.writeByteArrayToFile(file, byteArray);
    }

    // InputStream to file
    public static void outputStreamToFile(InputStream inputStream) throws IOException {
        final File file = new File("classpath:output.txt");
        FileUtils.touch(file);
        FileUtils.writeByteArrayToFile(file, IOUtils.toByteArray(inputStream));
    }
}
