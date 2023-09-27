package TestRail;


import java.util.Properties;

import org.openqa.selenium.WebDriver;

import QAFactory.Driver_factory;
import UtilityFiles.ConfigReader;

public class TestRailAccount {

	static Properties prop;
	public static APIClient testRailApiClient() {
    	
        String baseUrl = prop.getProperty("baseUrl");
        String usernameTestRail = prop.getProperty("usernameTestRail");
        String passwordTestRail = prop.getProperty("passwordTestRail");

        APIClient client = new APIClient(baseUrl);
        client.setUser(usernameTestRail);
        client.setPassword(passwordTestRail);

        return client;
    }
}
