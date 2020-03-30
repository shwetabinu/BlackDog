package blackdog_automation.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import blackdog_automation.base.BaseClass;

public class PropertyReader extends BaseClass {
	
	public PropertyReader() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String propertyReader(String propertyfile,String propertyname) throws IOException
	{
		FileInputStream fis=new FileInputStream(propertyfile+".properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(propertyname);
		
		
	}

}
