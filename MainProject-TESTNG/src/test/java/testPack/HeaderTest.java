package testPack;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

import pageObjects.EthicsAndCompilance;
import pageObjects.HomePage;
public class HeaderTest {
	HomePage hp;
	EthicsAndCompilance ep;
	public  int count=0;
	public static List<String>Data=new ArrayList<String>();
	public static  WebDriver driver;
	
	  	
	  @Parameters({"browser","url"})
	  @BeforeClass
	  public void setup(String browser,String url) {
		  
		  if(browser.equalsIgnoreCase("chrome")) {
		  driver=new ChromeDriver();
		  }
		  else if (browser.equalsIgnoreCase("Edge")){
			  driver=new EdgeDriver();
			  
		  }
		  else  {
			  driver=new FirefoxDriver();
		  }
		  
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  }
	
	
	@Test(priority=2, groups= {"regression"})
	public void company() throws IOException, InterruptedException {
		Thread.sleep(15000);
		hp=new HomePage(driver);
		hp.clickCompany();
		Thread.sleep(1000);
		conversion("company",hp.CompanyList);
	}
	
	
	@Test(priority=3, groups= {"regression"})
	public void serviceLines() throws IOException, InterruptedException {
		
		hp.clickServiceLines();
		Thread.sleep(1000);
		conversion("Service Lines",hp.ServiceLinesList);
		hp.hovercoreTehnologies();
		Thread.sleep(1000);
		conversion("core technologies",subData(hp.CoretechnologiesList,10,14));		
		hp.hoverSoftwareAndplatformEngineering();
		Thread.sleep(1000);
		conversion("SoftWare and Platform Engineering",subData(hp.SoftWareList,10,14));
		
	
	}
	@Test(priority=4, groups= {"regression"})
	public void salesResources() throws IOException, InterruptedException {
		
		hp.clickSalesResources();
		Thread.sleep(1000);
		conversion("sales Resources",hp.SalesResourcesList);
		
	
	}
	
	
	@Test(priority=5, groups= {"regression"})
	public void marketsAndCountries() throws IOException, InterruptedException {
		
		hp.clickMarketsandCountries();
		Thread.sleep(1000);
		conversion("Markets and Countries",hp.MarketsandCountriesList);
		hp.hoverAmericas();
		Thread.sleep(1000);		
		conversion("Americas",subData(hp.AmericasList,5,8));
		hp.hoverCountries();
		Thread.sleep(1000);
		conversion("countries",subData(hp.CountriesList,7,16));
		hp.hoverCommercialops();
		Thread.sleep(500);		
		hp.hoverAsiaPacificAndJapan();
		Thread.sleep(500);
		conversion("Asia Pacific and japan",subData(hp.AsiaPacificAndJapanlist,5,15));		
		hp.hoverEuropeMiddleEastAfrica();;
		Thread.sleep(1000);
		conversion("Europe Middle East and africa",subData(hp.EuropeMiddleEastAfricaList,5,7));		
		hp.hoverCountriesEMA();;
		Thread.sleep(500);
		conversion("countries EMEA",subData(hp.CountriesEMAList,7,29));
		
	}
	
	@Test(priority=6, groups= {"regression"})
	public void corporateFunctions() throws IOException, InterruptedException {
		
		hp.clickCorporateFunctions();
		Thread.sleep(1000);
		conversion("corporate functions",hp.CorporateFunctionsList);
		hp.hoverFinance();
		Thread.sleep(1000);		
		conversion("Finance",subData(hp.FinanceList,5,15));
		hp.hoverCorporateAffairs();
		Thread.sleep(1000);
		conversion("corporate affairs",subData(hp.LegalAndCorporateList,5,12));
		hp.hoverWorkspaceServices();
		Thread.sleep(500);	
		conversion("corporate work place ",subData(hp.WorkplaceList,12,13));
		hp.hoverRiskManagement();
		Thread.sleep(500);
		conversion("Risk management",subData(hp.RiskManagementList,12,17));		
		hp.hoverMarketing();;
		Thread.sleep(1000);
		conversion("Marketing",subData(hp.MarketingList,5,16));		
		hp.hoverClientExperiences();;
		Thread.sleep(500);
		conversion("client experience",subData(hp.ClientExpList,16,19));
		hp.hoverSecurityAndTechnology();;
		Thread.sleep(500);
		conversion("security and Technology",subData(hp.SecurityAndTechList,5,7));
	}
	
	
	@Test(priority=7, groups= {"regression"})
	public void people() throws IOException, InterruptedException {
		
		hp.clickPeople();
		Thread.sleep(1000);
		conversion("people",hp.PeopleList);
		hp.hoverCareers();
		Thread.sleep(1000);
		conversion("careers",subData(hp.CareersList,10,12));
		hp.hoverDiversityAndInclusion();
		Thread.sleep(1000);
		conversion("diversity and inclusion",subData(hp.InclusionList,10,11));
		hp.hoverRewardsLifeAndWork();
		Thread.sleep(1000);
		conversion("rewards life and work",subData(hp.RewardsList,10,14));
		
	
	}
	@Test(priority=8, groups= {"regression"})
	 public void userValidation() throws InterruptedException {
		
		
			hp.clickButton();		  			
			Assert.assertEquals(hp.userName.isDisplayed(),true,"test passed");
			Assert.assertEquals(hp.email.isDisplayed(),true,"test passed");
			System.out.println(hp.getUserName());
			System.out.println(hp.getEmail());
			System.out.println("user  verified"); 
			System.out.println("---------------------------------------------------");
		  
	  }
	
	
	
	
	@Test(priority=9, groups= {"regression"})
	public void ethicsAndCompilance() throws IOException, InterruptedException {
		ep=new EthicsAndCompilance(driver);
		hp.clickCorporateFunctions();
		Thread.sleep(1000);
		hp.hoverCorporateAffairs();
		Thread.sleep(1000);
		hp.clickEthicsCompilance();		
		Thread.sleep(1000);
		Assert.assertEquals(ep.getTitle().length()>0, true,ep.getTitle());
		System.out.println(ep.getTitle());
		//Assert.assertEquals(ep.getHeadText().length()>0,true,ep.getHeadText());
		System.out.println(ep.getHeadText());
		//Assert.assertEquals(ep.getMidText().length()>0,true,ep.getMidText());
		System.out.println(ep.getMidText());
		List<WebElement>body=ep.getBodyText();
		for(int i=0;i<body.size();i++) {
			System.out.println(body.get(i).getText());
		}
		conversion("Resources / Links",ep.getHelpLine());
		Assert.assertEquals(ep.getTailText().length()>0,true,ep.getTailText());
		System.out.println(ep.getTailText());
	}
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		driver.quit();
	}
	
		
	public List<WebElement> subData(List<WebElement>element,int a,int b) {
	    
		  List<WebElement>elements=element.subList(a, b);
		  return elements;
	  
	 } 
	
	 public void explicitWait(WebElement element) {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  wait.until(ExpectedConditions.visibilityOf(element));
	  }
	
		  
	 public void conversion(String heading,List<WebElement>element) throws IOException, InterruptedException {
		 Data.add("      "); 
		 Data.add(heading.toUpperCase());
		  
		  for(int i=0;i<element.size();i++) {			  
			  Data.add(element.get(i).getText());
			  System.out.println(element.get(i).getText());			  
		  }
		  Utility.output(Data);		 
		  System.out.println("-----------------------------------------------------");
		  
		  
	  }
	
}
