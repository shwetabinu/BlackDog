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
	
	

	@FindBy(xpath="//p[contains(text(),'Control: Single line textbox')]")
	 public WebElement question1;
	//@FindBy(id="197562")
	//WebElement single_line_textbox;
	@FindBy(xpath="//div[@class='textboxInline']/input[not(contains(@class, 'hasDatepicker'))]")
	public WebElement single_line_textbox;
	
	
	@FindBy(xpath="//p[contains(text(),'Control: Multi-line')]")
	public WebElement question2;
	/*@FindBy(id="197563")
	WebElement multi_line_textbox;*/
	@FindBy(xpath="//div[@class='question Text Multi-line']/textarea")
	public WebElement multi_line_textbox;
	
	
	@FindBy(xpath="//p[contains(text(),'Control: DatePicker')]")
	public WebElement question3;
	/*@FindBy(id="197564")
	WebElement date_picker;*/
	@FindBy(xpath="//div[@class='textboxInline']/input[contains(@class, 'hasDatepicker')]")
	public WebElement date_picker;
	
	/*@FindBy(xpath="//p[contains(text(),'Located between the Pacific and Indian Oceans, Aus')]")
	WebElement text;*/
	@FindBy(xpath="//span[contains(text(),'Plain Text')]")
	public WebElement question4;
	@FindBy(xpath="//div[@class=\"question PlainText\"][1]/p[3]")
	public WebElement plaintext;
	
	
	@FindBy(xpath="//p[contains(text(),'Control: Drop Down')]")
	public WebElement question5;
	/*@FindBy(name="197566")
	WebElement drop_down;*/
	@FindBy(xpath="//div[@class=\"question DropDown answers-options-six\"]/select")
	public WebElement drop_down;
	
	@FindBy(xpath="//p[contains(text(),'Control: Multi-Choice')]")
	public WebElement question6;
	@FindBy(xpath="//div[@class='question MultiChoice One-line-per-answer answers-options-four']//span//label[1]//input[1]")
	public WebElement[] mcq;
	
	@FindBy(xpath="//p[contains(text(),'Control: Check-boxes')]")
	public WebElement question7;
	@FindBy(xpath="question Checkboxes One-line-per-answer answers-options-four']//span/label[1]//input[1])")
	WebElement[] checkbox;
	
	
	//sliderbar automation needs to be done in the functions
	@FindBy(xpath="//p[contains(text(),'Control: Slider-bar')]")
	public WebElement question8;
	@FindBy(className="choiceBelow")
	public WebElement slider_bar;
	
	@FindBy(xpath="//p[contains(text(),'Control: Flip Card')]")
	public WebElement question9;
	@FindBy(className="personImage")
	public WebElement flipcard_image;
	@FindBy(xpath="//div[@class='col-md-9 col-xs-9 col-sm-9']/ol/li")
	public WebElement[] flipcard_content;
	
	@FindBy(xpath="//p[contains(text(),'Control: Text With Image')]")
	public WebElement question10;
	@FindBy(xpath="//span[@class='text-with-image-t	ext col-md-12']/h1")
	public WebElement text_image_heading;
	@FindBy(xpath="//span[@class='text-with-image-text col-md-12']/p[2]")
	public WebElement text_image_para;
	
	/**
	 * Carousel web elements
	 */
	@FindBy(xpath="//span[contains(text(),'Control: Carousel')]")
	public WebElement question11;
	
	@FindBy(xpath="//div[@class='question Carousel']//li")
	public WebElement[] carousel_all_options_buttons;
	
	@FindBy(xpath="//li[@class=\"active\"]")
	public WebElement carousal_active_option_button;
	
	
	@FindBy(className="left carousel-control carouselArrows")
	public WebElement left_carousal_arrow;
	
	@FindBy(className="right carousel-control carouselArrows")
	public WebElement right_carousal_arrow;
	
	@FindBy(xpath="//div[@class=\"questiontextcarousel row\"]/div[2]/p")
	public WebElement[] carousel_text;
	
	@FindBy(xpath="//div[@class=\"item active\"]//p")
	public WebElement carousel_active_text;
	
	
	@FindBy(xpath="//p[contains(text(),'Control: Accordion')]")
	public WebElement question12;
	@FindBy(xpath="//div[@class='question Accordion answers-options-two']/div[@class='panel-group']/div/div[1]")
	public WebElement[] accordion;
	
	@FindBy(xpath="///span[contains(text(),'Control: Matrix Number')]")
	public WebElement question13;
	@FindBy(xpath="//div[@class='question MatrixNumber answers-options-three']//tr//td//label[1]//input[1]")
	public WebElement[] matrix_number;
	
	@FindBy(xpath="//span[contains(text(),'Control: Matrix Radio')]")
	public WebElement question14;
	@FindBy(xpath="//div[@class='answerMob col-sm-12 col-xs-12']//span/input")
	public WebElement[] matrix_radio;
	
	@FindBy(xpath="//strong[contains(text(),'Control: Matrix Text')]")
	public WebElement question15;
	@FindBy(xpath="//div[@class='question MatrixText answers-options-four']//tr//td//label[1]//input[1]")
	public WebElement[] matrix_text;
	
	@FindBy(xpath="//span[contains(text(),'Control: Audio Text')]")
	public WebElement question16;
	@FindBy(xpath="//audio[@class='audioControls']")
	public WebElement audio_control;
	
	@FindBy(xpath="//span[contains(text(),'Control: Interactive Body Map')]")
	public WebElement question17;
	@FindBy(xpath="//div[@class='question InteractiveBodyMap']//div[contains(@class,'section')]")
	public WebElement[] body_map;

	@FindBy(xpath="//span[contains(text(),'Control: Input with image & audio')]")
	public WebElement question18;
	@FindBy(name="txtbox_197580")
	public WebElement textbox_2;
	@FindBy(className="submitbtn")
	public WebElement submit_btn;
	
	@FindBy(xpath="//span[contains(text(),'Control: Timer')]")
	public WebElement question19;
	@FindBy(linkText="Start")
	public WebElement start_button;
	
	@FindBy(xpath="//span[contains(text(),'Control: Suggestions')]")
	public WebElement question20;
	@FindBy(xpath="//h3[@class='suggestionsForFrontText']/span/p")
	public WebElement suggestions_front;
	
	@FindBy(className="collapsedSuggestion")
	public WebElement suggestion_down_arrow;
	
	@FindBy(xpath="//div[@class=\"suggestionsDesc\"]/p")
	public WebElement suggestions_desc;
	
	@FindBy(className="btn-survey-inner-nextsurvey ButtonBlue SurveyNextButton")
	public WebElement next_btn;
	
	
	
	
}
