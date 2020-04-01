package blackdog_automation.tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import blackdog_automation.all_functions.Fill_Survey;
import blackdog_automation.all_functions.InitClass;

public class To_verify_if_user_can_go_to_next_page extends InitClass {

	public To_verify_if_user_can_go_to_next_page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	/*@BeforeTest
	public void launching_website()
	{
		
	}*/
	
    @Test
	public void To_verify_if_user_can_go_to_next_page () throws Exception

	{
    	initBrowser();
    	Fill_Survey f=new Fill_Survey();
    	f.enterSurveyQuestions();
		
	}
    
    
    @AfterTest
    public void closing_browser()
    {
    	
    }

}
