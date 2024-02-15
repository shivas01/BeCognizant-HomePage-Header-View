package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
public class HomePage  {
	public WebDriver driver;
	public Actions act;
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*
	@FindBy(xpath="//input[@name='passwd']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='idSIButton9']")
	WebElement signIn;
	 
	*/
	
	  @FindBy(xpath="//div[@id='O365_HeaderRightRegion']") 
		WebElement userButton;
	
	  @FindBy(xpath="//div[@id='mectrl_currentAccount_primary']") 
		public WebElement userName;
	
	  @FindBy(xpath="//div[@id='mectrl_currentAccount_secondary']") 
		public WebElement email;
	
	  
	  
	  
	
	//company
	@FindBy(xpath="//button[@name='Company']") 
	WebElement Company;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement> CompanyList;
	//service lines
	@FindBy(xpath="//button[@name='Service Lines']") 
	WebElement ServiceLines;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>ServiceLinesList;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>CoretechnologiesList;
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[1]") 
	public WebElement coreTehnologies;
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[2]") 
	public WebElement SoftwareAndplatformEngineering;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>SoftWareList;
	
	//sales resources
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>SalesResourcesList;
		
	@FindBy(xpath="//button[@name='Sales Resources']") 
	WebElement SalesResources;
	
	//markets and countries
	@FindBy(xpath="//button[@name='Markets and Countries']") 
	public WebElement MarketsandCountries;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>MarketsandCountriesList;
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[1]") 
	public WebElement Americas;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>AmericasList;
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[4]") 
	public WebElement Countries;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>CountriesList;
	
	@FindBy(xpath="(//span[contains(@class,'ContextualMenu')])[8]") 
	public WebElement commercialops;
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[2]") 
	public WebElement AsiaPacificAndJapan;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>AsiaPacificAndJapanlist;
	
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[3]") 
	public WebElement EuropeMiddleEastAfrica;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>EuropeMiddleEastAfricaList;
	
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[4]") 
	public WebElement CountriesEMA;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>CountriesEMAList;
	
	//corporate functions
	
	@FindBy(xpath="(//span[contains(@class,'ContextualMenu')])[7]") 
	public WebElement ethicsAndCompilance;
	
	
	
	@FindBy(xpath="//button[@name='Corporate Functions']") 
	public WebElement CorporateFunctions;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>CorporateFunctionsList;
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[1]") 
	public WebElement Finance;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>FinanceList;
	
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[2]") 
	public WebElement CorporateAffairs;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>LegalAndCorporateList;
	
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[5]") 
	public WebElement WorkspaceServices;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>WorkplaceList;
	
	
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[6]") 
	public WebElement RiskManagement;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>RiskManagementList;
	
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[3]") 
	public WebElement Marketing;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>MarketingList;
	
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[5]") 
	public WebElement ClientExperiences;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>ClientExpList;
	
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[4]") 
	public WebElement SecurityAndTechnology;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>SecurityAndTechList;
	
	
	@FindBy(xpath="//button[@name='People']") 
	public WebElement People;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>PeopleList;
	
	
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[1]") 
	public WebElement Careers;
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>CareersList;
	
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[2]") 
	WebElement DiversityAndInclusion;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>InclusionList;
	
	
	@FindBy(xpath="(//i[contains(@class,'ContextualMenu')])[3]") 
	WebElement RewardsLifeAndWork;
	
	@FindBy(xpath="//span[contains(@class,'ContextualMenu')]")
	public List<WebElement>RewardsList;
	
	
	
	
	
	
	public  void Actions(WebElement element) {
		act=new Actions(driver);
		act.moveToElement(element).perform();
		}


	
	
	public void clickButton() {
		  userButton.click();
	  }
	  
	  
	  public String getUserName() {
		  return userName.getText();
	  }
	  
	  
	  public String getEmail() {
		  return email.getText();
	  }
	
	public void clickCompany()
	{
		Company.click();
	}
	
	public void clickServiceLines()
	{
		ServiceLines.click();
	}
		
	
	public void hovercoreTehnologies()
	{
		Actions(coreTehnologies);
	}
	public void hoverSoftwareAndplatformEngineering()
	{
		Actions(SoftwareAndplatformEngineering);
	}
	public void clickSalesResources()    
	{
		SalesResources.click();
	}

	public void clickMarketsandCountries()   
	{
		MarketsandCountries.click();
	}
	public void hoverAmericas()
	{
		Actions(Americas);
	}
	public void hoverCountries()
	{
		Actions(Countries);
	}
	public void hoverCommercialops()
	{
		Actions(commercialops);
	}
	
	public void hoverAsiaPacificAndJapan()
	{
		Actions(AsiaPacificAndJapan);
	}

	public void hoverEuropeMiddleEastAfrica()
	{
		Actions(EuropeMiddleEastAfrica);
	}
	public void hoverCountriesEMA()
	{
		Actions(CountriesEMA);
	}	

	public void clickCorporateFunctions()    
	{
		CorporateFunctions.click();
	}
	public void clickEthicsCompilance() {
		ethicsAndCompilance.click();
	}
	
	public void hoverFinance()
	{
		Actions(Finance);
	}
	public void hoverCorporateAffairs()
	{
		Actions(CorporateAffairs);
	}
	public void hoverWorkspaceServices()
	{
		Actions(WorkspaceServices);
	}
	public void hoverRiskManagement()
	{
		Actions(RiskManagement);
	}
	public void hoverMarketing()
	{
		Actions(Marketing);
	}
	public void hoverClientExperiences()
	{
		Actions(ClientExperiences);
	}
	public void hoverSecurityAndTechnology()
	{
		Actions(SecurityAndTechnology);
	}
	public void clickPeople()    
	{
		People.click();
	}
	public void hoverCareers()
	{
		Actions(Careers);
	}
	public void hoverDiversityAndInclusion()
	{
		Actions(DiversityAndInclusion);
	}
	public void hoverRewardsLifeAndWork()
	{
		Actions(RewardsLifeAndWork);
	}
	











}
