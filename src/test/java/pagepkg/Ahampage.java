package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ahampage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/div/header/div/div[2]/div/a[1]")
	WebElement loginicon;
	@FindBy(xpath="//*[@id=\"CustomerEmail\"]")
	WebElement mail;
	@FindBy(id="CustomerPassword")
	WebElement password;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div/input")
	WebElement button;
	
	  public Ahampage(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	} 
	  public void logicon() {
		  loginicon.click();
		  
	  }
	  public void clear() {
		  clear();
	  }

public void ahamlogin(String email,String pwd) {
	
    mail.sendKeys(email);
    password.sendKeys(pwd);
    button.click();
	
	
	
}
}
