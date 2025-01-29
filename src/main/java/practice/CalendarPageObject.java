package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPageObject {

   
    public CalendarPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

   
    @FindBy(xpath = "//*[@class='_2KpZ6l _2doB4z']")
    public WebElement clkClose;
 @FindBy(id = "shsdhjhsjhsd")
 private WebElement btn;
   
    @FindBy(xpath = "//*[@name='q']")
    public WebElement txtMobile;

    @FindBy(xpath = "//*[@class='L0Z3Pu']")
    public WebElement clckSearch;

    @FindBy(xpath = "(//*[text()='Mobiles & Accessories'])[1]")
    public WebElement validateMobileAccesories;

    @FindBy(xpath = "(//*[@class='ytSearchboxComponentInput yt-searchbox-input title'])")
    public WebElement YTbtn;

    @FindBy(xpath = "//*[@id='day']")
    public WebElement ddnDate;
}
