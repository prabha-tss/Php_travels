package phptravelsTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class datahub {
	
	@FindBy(xpath="//*[@id='//header-waypoint-sticky']/div[1]/div/div/div[2]/div/ul/li[3]/div/a")
	public static WebElement myaccount;
	@FindBy(xpath="//*[@id='//header-waypoint-sticky']/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]")
	public static WebElement logclk;
	
	@FindBy(xpath="//*[@id='loginfrm']/div[3]/div[1]/label/input")
	public static WebElement EmainInp;
	
	@FindBy(xpath="//*[@id='loginfrm']/div[3]/div[2]/label/input")
	public static WebElement pwd;
	@FindBy(xpath="//*[@id='loginfrm']/button")
	public static WebElement LoginBtn;
//____________________________________________________________________________________________________________________________________________
											//Menu Navigation

	@FindBy(xpath="//*[@id='mobileMenuMain']/nav/ul[1]/li/a")
	public static WebElement NavHome;
	
	//----------------------------------------------------------------------------------------------------------------------------------
														//MyProfile

	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a")
	public static WebElement myprofileclk;
	
	@FindBy(xpath="//*[@id='profilefrm']/div/div/div[2]/div[2]/div/input")
	 public static WebElement myprofilepwd;
	
	@FindBy(xpath="//*[@id='profilefrm']/div/div/div[2]/div[3]/div/input")
	public static WebElement myprofileCpwd;
	
//___________________________________________________________________________________________________________________________________________
												//Home
	@FindBy(xpath="//*[@id='s2id_autogen16']")
	public static WebElement hdestclk;
	@FindBy(xpath="//*[@id='checkin']")
	public static WebElement cal;
	@FindBy(xpath="//*[@id='select2-drop']")
	public static WebElement hotval;
	@FindBy(xpath="//*[@id='select2-drop']/ul/li[1]/ul/li[6]")
	public static WebElement exitclk;
	//@FindBy(xpath="//*[@id='select2-drop']/ul/li[1]/ul/li//div")
	//public static WebElement HotelList;
	@FindBy(xpath="//*[@id='select2-drop']/ul/li[2]/ul/li[8]")
	public static WebElement a;
	
//____________________________________________________________________________________________________________________________________________
												//chkinout
	@FindBy(xpath="//*[@id='checkin']")
	public static WebElement chkindt;
	@FindBy(xpath="//*[@id='checkout']")
	public static WebElement chkout;
	
	
	
	
	
}


