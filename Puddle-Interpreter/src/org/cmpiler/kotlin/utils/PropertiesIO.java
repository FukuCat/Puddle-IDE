package org.cmpiler.kotlin.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesIO {

    private PropertiesIO(){}

    public static String readProperty(String key, String path) throws IOException {
        String result = null;
        File file = new File(path);
        FileInputStream fileInput = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInput);
        fileInput.close();
        result = properties.getProperty(key);
        return result;
    }

    public static void printProperty(String path) throws IOException {
        File file = new File(path);
        FileInputStream fileInput = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInput);
        fileInput.close();

        Enumeration enuKeys = properties.keys();
        while (enuKeys.hasMoreElements()) {
            String key = (String) enuKeys.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key + ": " + value);
        }

    }
}
