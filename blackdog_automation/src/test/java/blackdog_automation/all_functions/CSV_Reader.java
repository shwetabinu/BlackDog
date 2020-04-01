package blackdog_automation.all_functions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CSV_Reader {

/*	
	public static String propertyReader(String propertyfile,String propertyname) throws IOException
	{
		FileInputStream fis=new FileInputStream(propertyfile+".properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(propertyname);
		
		
	}
	
*/
	
	public static String[] readCSV() throws IOException
	{
		String[] data=null;
		File csvFile = new File("//BlackDog_SurveyFields.csv");
		if (csvFile.isFile()) {
		    
			BufferedReader csvReader = new BufferedReader(new FileReader("//BlackDog_SurveyFields.csv"));
			String row;
			while ((row = csvReader.readLine()) != null) {
			    data = row.split(",");
			    // do something with the data
			}
			csvReader.close();
			
			
		}
		return data;
	}
}
