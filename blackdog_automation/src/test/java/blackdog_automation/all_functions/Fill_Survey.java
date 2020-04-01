package blackdog_automation.all_functions;

import java.io.IOException;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import blackdog_automation.object_repository.Screening_page;

public class Fill_Survey extends InitClass{

	public Fill_Survey() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public static void enterSurveyQuestions() throws IOException
	{
		Screening_page p=new Screening_page();
		p.single_line_textbox.sendKeys("Testing");
	
	
	
	
		
	}

}
