package phptravelsTNG;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class login {
	static WebDriver driver;
	String EmainInp="user@phptravels.com";
	String pwd="demouser";
	String mypwd = "praba123";
	String mycpwd = "praba123";
	String droval = "Madinah Moevenpick Hotel, Madinah";
	@BeforeSuite()
	 void drvinvog() {
		 
		 System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("-start-maximized");
			options.setExperimentalOption("useAutomationExtension", false);
			options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			driver = new ChromeDriver(options);
			driver.get("https://www.phptravels.net/home");
			
			
			
	 }
	
	
	
	
	@Test(retryAnalyzer=fieldanalyzer.class)
	void loginvalidation() {
		PageFactory.initElements(driver, datahub.class);
		datahub.myaccount.click();
		datahub.logclk.click();
		WebDriverWait EmainInpwit = new WebDriverWait(driver,30);
		EmainInpwit.until(ExpectedConditions.visibilityOf(datahub.EmainInp));
		datahub.EmainInp.sendKeys(EmainInp);
		datahub.pwd.sendKeys(pwd);
		datahub.LoginBtn.click();
		TakesScreenshot tk = (TakesScreenshot) driver;
		File sfile = tk.getScreenshotAs(OutputType.FILE);
		File fil = new File("E://output/sample.png");
		try {
			FileHandler.copy(sfile, fil);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait mypwait = new WebDriverWait(driver,30);
		mypwait.until(ExpectedConditions.visibilityOf(datahub.myprofileclk));
		datahub.myprofileclk.click();
		datahub.myprofilepwd.sendKeys(mypwd);
		datahub.myprofileCpwd.sendKeys(mycpwd);
		datahub.NavHome.click();
		
		
		
}
	
	
	
	@Test(retryAnalyzer=fieldanalyzer.class)
	void hoteldes() {
		PageFactory.initElements(driver, datahub.class);
		WebDriverWait hdeswit = new WebDriverWait(driver,30);
		hdeswit.until(ExpectedConditions.visibilityOf(datahub.hdestclk));
		datahub.hdestclk.click();
		WebDriverWait wit = new WebDriverWait(driver,30);
		wit.until(ExpectedConditions.elementToBeClickable(datahub.a));
		

			List<WebElement> HotList = driver.findElements(By.xpath("//*[@id='select2-drop']/ul//li"));
			System.out.println("---------------------------------------------------------------------------");
			System.out.println(HotList.size());
			System.out.println("---------------------------------------------------------------------------");
			int dropcount = HotList.size();
			String drop1 = "//*[@id='select2-drop']/ul/li[1]/ul/li[";
			String drop2="]";
			for(int i =1; i<= dropcount; i++) {
				try {
					WebDriverWait wt = new WebDriverWait(driver, 30);
					wt.until(ExpectedConditions.elementToBeClickable(By.xpath(drop1+i+drop2)));
					String ell = driver.findElement(By.xpath(drop1+i+drop2)).getText();
					if(ell.equals(droval)) {
						driver.findElement(By.xpath(drop1+i+drop2)).click();
						break;
					}
					
				}catch (Exception e) {
					System.out.println();
				}
				
			}
		
	}
@Test(retryAnalyzer=fieldanalyzer.class)
void chkinout() {
	PageFactory.initElements(driver, datahub.class);
	datahub.chkindt.click();
	datahub.chkindt.clear();
	datahub.chkindt.sendKeys("01/01/2021");
	datahub.chkout.click();
	datahub.chkout.clear();
	datahub.chkout.sendKeys("01/01/2021");
	
}

/*	
@Test()
	void MyProfile() {
		
		
		datahub.myprofilepwd.sendKeys(mypwd);
		datahub.myprofileCpwd.sendKeys(mycpwd);
		datahub.NavHome.click();
	}
@Test()
void homechk() {
	PageFactory.initElements(driver,datahub.class);
	datahub.flightclk.click();
	
}

*/
@AfterSuite
public void winclose(){
	//driver.close();
	
}
	
}
