package ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {
	String path = ".//SeleniumBatchSept2023//Data//data.properties";
	Properties prop;     // 1. path 2. load 3. Read/write
	
	@Test
	public void Read() throws IOException {
		prop = new Properties();
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		
		String str = prop.getProperty("username");
		System.out.println(str);
	}
	
	
}
