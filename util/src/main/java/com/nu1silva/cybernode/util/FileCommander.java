package com.nu1silva.cybernode.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FileCommander {

    /**
     * Create File Operation
     * Creates a file with the following parameters.
     *
     * @param path
     * @param fileName
     * @param encoding
     * @param content
     */
    public void CreateFile(String path, String fileName, String encoding, String content) {
        try {
            PrintWriter printWriter = new PrintWriter(path + "/" + fileName, encoding);
            printWriter.println(content);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
