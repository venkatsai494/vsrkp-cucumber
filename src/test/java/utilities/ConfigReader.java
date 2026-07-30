package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        loadProperties();
    }

//    public static void main(String[] args) {
//        System.out.println(ConfigReader.getTags());
//    }

    private static void loadProperties() {
        String configFilePath = System.getProperty("config.file", "src/test/resources/config/Configuration.properties");

        try (InputStream file = new FileInputStream(configFilePath)) {
            properties.load(file);
        } catch (IOException e) {
            System.out.println("Error occurred while reading configuration file: " + configFilePath);
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getTags() {
        return properties.getProperty("tags", "@test");
    }
}
