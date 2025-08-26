package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// This class will be used to read our Config.properties file
public class ConfigReader
{
    // Properties object will hold all key-value pairs from Config.properties
    private static Properties prop;

    // This method will load the config file into the Properties object
    public static void loadConfig()
    {
        try {
            // FileInputStream opens the file in read mode
            FileInputStream fis = new FileInputStream("src/main/resources/Config.properties");
            prop = new Properties();
            prop.load(fis);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static String get(String key)
    {
        return prop.getProperty(key);
    }
}
