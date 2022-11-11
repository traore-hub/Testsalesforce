package common;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
	
	
	public static String getProperty(String property) throws Exception{
		InputStream input = new FileInputStream("src/test/resources/properties/properties-"+getClient());
        Properties properties = new Properties();
        properties.load(input);
        return(properties.getProperty(property));
	}
	
	public static String getClient() throws Exception{
		InputStream input = new FileInputStream("src/test/resources/properties/client");
        Properties properties = new Properties(); properties.load(input);
        return(properties.getProperty("ClientId"));
	}

}
