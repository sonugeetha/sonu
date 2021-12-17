package handsonexercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

import utilities.Helper;

public class ReadFromPropFile {
	
@Test
	public void readFromPropFileTest() throws IOException{
		Properties prop=new Properties();
		String file="src/test/resources/credentials.prop";
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("browser"));
		}

@Test
public void readFromPropFileUsingHelper() throws IOException{
	String filepath="src/test/resources/credentials.prop";
	Helper helper=new Helper();
//System.out.println(helper.readFromFile(filepath,"browser"));
}
}

