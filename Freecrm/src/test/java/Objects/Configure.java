package Objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configure {

	
	public String Propertyset() throws IOException {
		
		File file =new File("./Config/Config.properties");
		
		FileInputStream fis= new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String link = prop.getProperty("url");
		
		return link;
	}
}
