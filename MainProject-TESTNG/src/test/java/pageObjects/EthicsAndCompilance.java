package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
public class EthicsAndCompilance  {
	public WebDriver driver;
	public Actions act;
	
	public EthicsAndCompilance(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy(xpath="//div[contains(@title,'Ethics & Compliance')]") 
	WebElement Title;
	
	@FindBy(xpath="//*[@id='QuicklinksItemTitle']")
	List<WebElement>HelpLine;
	

	@FindBy(tagName="p") 
	WebElement HeadText;
	
	@FindBy(xpath="//p[2]") 
	WebElement MidText;
	
	@FindBy(xpath="//p[3]") 
	WebElement TailText;
	
	
	
	
	
	public String getTitle() {
		return Title.getText();
	}
		
	public List<WebElement> getHelpLine() {
		return HelpLine;
	}	
	
	public String getHeadText() {
		return HeadText.getText();
	}	
	
	public String getMidText() {
		return MidText.getText();
	}	
	
	public String getTailText() {
		return TailText.getText();
	}
		
	public List<WebElement> getBodyText() {
		List<WebElement>elements=new ArrayList<WebElement>();
		for(int i =1;i<6; i++) {
			WebElement liElement = driver.findElement(By.cssSelector("div[id='spPageChromeAppDiv'] li:nth-child("+i+")"));
				elements.add(liElement);
		}
		return elements;
	}
	
	








}
