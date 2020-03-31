package blackdog_automation.object_repository;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import blackdog_automation.all_functions.InitClass;



/**
 * Screening page with all types of webelements.
 * 
 * All the webelements are identified
 * 
 *
 */
public class Screening_page extends InitClass{

	public Screening_page() throws IOException {

		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(name="197562")
	//WebElement single_line_textbox;
	
	@FindBy(xpath="/div[@class='textboxInline']/input[not(contains(@class, 'hasDatepicker'))]")
	WebElement single_line_textbox;
	
	/*@FindBy(name="197563")
	WebElement multi_line_textbox;*/
	
	@FindBy(xpath="//div[@class='question Text Multi-line']/textarea")
	WebElement multi_line_textbox;
	
	/*FindBy
	@FindBy(name="197564")
	WebElement date_picker;*/
	
	@FindBy(xpath="//div[@class='textboxInline']/input[contains(@class, 'hasDatepicker')]")
	WebElement date_picker;
	
	/*@FindBy(xpath="//p[contains(text(),'Located between the Pacific and Indian Oceans, Aus')]")
	WebElement text;*/
	
	@FindBy(xpath="//div[@class=\"question PlainText\"][1]/p[3]")
	WebElement plaintext;
	
	/*@FindBy(name="197566")
	WebElement drop_down;*/
	
	@FindBy(xpath="//div[@class=\"question DropDown answers-options-six\"]/select")
	WebElement drop_down;
	
	@FindBy(xpath="//div[@class='question MultiChoice One-line-per-answer answers-options-four']//span//label[1]//input[1]")
	WebElement[] mcq;
	
	@FindBy(xpath="question Checkboxes One-line-per-answer answers-options-four']//span/label[1]//input[1])")
	WebElement[] checkbox;
	
	
	//sliderbar automation needs to be done in the functions
	
	@FindBy(xpath="//div[@class='choiceBelow']")
	WebElement slider_bar;
	
	@FindBy(xpath="//img[@class='personImage']")
	WebElement flipcard_image;
	
	@FindBy(xpath="//div[@class='col-md-9 col-xs-9 col-sm-9']/ol/li")
	WebElement[] flipcard_content;
	
	@FindBy(xpath="//span[@class='text-with-image-text col-md-12']/h1")
	WebElement text_image_heading;
	
	@FindBy(xpath="//span[@class='text-with-image-text col-md-12']/p[2]")
	WebElement text_image_para;
	
	//WebElement carousel need to be identified
	
	@FindBy(xpath="//div[@class='question Accordion answers-options-two']/div[@class='panel-group']/div/div[1]")
	WebElement[] accordion;
	
	@FindBy(xpath="//div[@class='question MatrixNumber answers-options-three']//tr//td//label[1]//input[1]")
	WebElement[] matrix_number;
	
	@FindBy(xpath="//div[@class='answerMob col-sm-12 col-xs-12']//span/input")
	WebElement[] matrix_radio;
	
	@FindBy(xpath="//div[@class='question MatrixText answers-options-four']//tr//td//label[1]//input[1]")
	WebElement[] matrix_text;
	
	@FindBy(xpath="//audio[@class='audioControls']")
	WebElement audio_control;
	
	@FindBy(xpath="//div[@class='question InteractiveBodyMap']//div[contains(@class,'section')]")
	WebElement[] body_map;
	
	@FindBy(name="txtbox_197580")
	WebElement textbox_2;
	
	@FindBy(className="submitbtn")
	WebElement submit_btn;
	
	@FindBy(linkText="Start")
	WebElement start_button;
	
	@FindBy(xpath="//h3[@class='suggestionsForFrontText']/span/p")
	WebElement suggestions_front;
	
	@FindBy(className="collapsedSuggestion")
	WebElement suggestion_down_arrow;
	
	@FindBy(xpath="//div[@class=\"suggestionsDesc\"]/p")
	WebElement suggestions_desc;
	
	@FindBy(className="btn-survey-inner-nextsurvey ButtonBlue SurveyNextButton")
	WebElement next_btn;
	
	
	
	
}
