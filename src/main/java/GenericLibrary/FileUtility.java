package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
public String getDataFromProperty(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/propertyFile.properties");
	Properties property = new Properties();
	property.load(fis);
	return property.getProperty(key);
}
}
