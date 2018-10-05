package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="loginlink")
	private WebElement loginlink;
	
	@FindBy(xpath="//input[@id='userHandle']")
	private WebElement emailaddress;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	
	@FindBy(xpath="//button[@class='btn btn-login']")
	private WebElement loginbtn;
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void login_register_btn()
	{
		loginlink.click();
	}
public void emailaddtb(String email)
{
	emailaddress.sendKeys(email);
}
public void passwordtb(String pass )
{
	password.sendKeys(pass);
}
public void login()
{
	loginbtn.click();
}
}
