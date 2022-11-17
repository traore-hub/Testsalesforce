package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFile {

public static Properties property;
private static String configpath="src/main/resources/config.properties";


public static void initialiseFile() throws FileNotFoundException {
    property = new Properties();
    try{
    InputStream inputStream= new FileInputStream(configpath);
    property.load(inputStream);
}catch (Exception e){e.getCause();
    }


}}
