package Testpckg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepckg.etsypage;

public class etsySearchTest {
WebDriver driver;
etsypage Etsypage;

@BeforeTest
public void setUp()
{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Etsypage=new etsypage(driver);
}
@Test
public void testSearch()
{
	driver.get("https://www.etsy.com/");
	Etsypage.searchForItem("Home Favourites");
	assert driver.getTitle().contains("Home Favourites");
}
@AfterTest
public void tearDown()
{
	if(driver != null)
	{
		driver.quit();
	}
	
}
}
