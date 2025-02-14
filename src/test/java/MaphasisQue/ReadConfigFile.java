package MaphasisQue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	Properties properties;
	String path="D:\\automation\\automation\\src\\test\\java\\MaphasisQue\\Config.properties";
	public ReadConfigFile() {
		properties=new Properties();
		try {
			FileInputStream fis=new FileInputStream(path);
			try {
				properties.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public String getURL() {
		String url=properties.getProperty("url");
		return url;
		
	}
	public String getUserName() {
		String url=properties.getProperty("username");
		return url;
		
	}
	public String getPassword() {
		String url=properties.getProperty("password");
		return url;
		
	}
}
