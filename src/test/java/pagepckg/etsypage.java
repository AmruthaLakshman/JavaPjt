package pagepckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class etsypage {
WebDriver driver;

@FindBy(xpath="//*[@id=\"global-enhancements-search-query\"]")
WebElement searchBox;
		
@FindBy(xpath="//*[@id=\"desktop-category-topnav\"]/div/div/ul/li[2]/a")
WebElement searchButton;

public etsypage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void searchForItem(String item)
{
searchBox.sendKeys(item);
searchButton.click();
}
public String getpageTitle()
{
	return driver.getTitle();
}
}