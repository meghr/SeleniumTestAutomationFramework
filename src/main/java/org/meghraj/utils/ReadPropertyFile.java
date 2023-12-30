package org.meghraj.utils;

import org.meghraj.constants.FrameworkConstant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

    private ReadPropertyFile() {
    }

    private static Properties properties = new Properties();
    private static final Map<String, String> ConfigMap = new HashMap<>();

    static {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(FrameworkConstant.getConfigPropertyPath());
            properties.load(fileInputStream);

            for (Map.Entry<Object, Object> entry : properties.entrySet()
            ) {
                ConfigMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    // We are using below by using HashMap if there is very big propertly file and we need to read it again and again
    public static String get(String key) throws Exception {
        if (Objects.isNull(key) || Objects.isNull(ConfigMap.get(key))) {
            throw new Exception("Property Named " + key + " Not Found config.properties file, Please check config.properties file ");
        }
        return ConfigMap.get(key);
    }

    // below we can use when less retrieval as Property use HashTable which is Thread safe

   /* public static String getValue(String key) throws Exception {

        if (Objects.isNull(properties.getProperty(key)) || Objects.isNull(key)) {
            throw new Exception("Property Named " + key + " Not Found config.properties file, Please check config.properties file ");
        }
        return properties.getProperty(key);
    }*/
}
