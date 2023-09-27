package UtilityFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * To read the peroperties from the config files
 */
public class ConfigReader {

	/*
	 * will be raeding configuration with the help of property file
	 * SO we have to create onject of properties from java.util package
	 */
	private Properties prop;
	/*
	 * Encapsulation done here
	 * Implemented properties as private and if someone want to get the properties (prop)
	 * cannot acces directly so to access we need to call init_prop
	 */
	public Properties init_prop() {
		prop = new Properties();
		/*
		 * To interact with config.properties file
		 * we have to use FileInputStream class
		 */
		try {
			FileInputStream ip =new FileInputStream("./src/test/resources/configfiles/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
}
