package telran.configuration.example;

import telran.configuration.Configuration;

public class TestConfigurationAppl {

	private static final String DEFAULT_FILE_NAME = "app.properties";

	public static void main(String[] args) throws Exception {
		String fileName = args.length > 0 ? args[0]: DEFAULT_FILE_NAME;
		TestConfiguration testObj = new TestConfiguration();
		Configuration config = new Configuration(testObj, fileName);
		config.configInjection();
		System.out.println(testObj);

	}

}
