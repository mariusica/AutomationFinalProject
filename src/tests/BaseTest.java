package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import messages.URL;
import pages.BasePage;
import testdata.TestData;
import testdata.User;

public class BaseTest {
	static WebDriver driver;
	BasePage page;
	
	User standardUser = new User("standarduser");
	TestData testdata = new TestData();
	
	@BeforeClass
	public static void beforeAll() {
		
	}
	@AfterClass
	public static void afterAll() {
		
	}
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		page  = new BasePage(driver);
		
		driver.navigate().to(URL.LOGIN);	
	}
	@After
	public void after() {
		driver.close();
		driver.quit();
	}
	
	
	

}
