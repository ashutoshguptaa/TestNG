package scripts;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import POM.Homepage;
import POM.Loginpage;
import POM.Logoutpage;
import POM.Productpage;
import generic.Baseclass;
import generic.Excel;

public class Loging_Search extends Baseclass {

	 @Test
	 public void login_search()
	 {
		String us = Excel.abc(excelpath,"Sheet1",1,0);
		String pass = Excel.abc(excelpath,"Sheet1",1,1);
		String name = Excel.abc(excelpath,"Sheet1",1,2);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.infibeam.com/");
		Loginpage l=new Loginpage(driver);
		l.login_register_btn();
		l.emailaddtb(us);
		l.passwordtb(pass);
		l.login();
		Homepage h=new Homepage(driver);
		h.searchtb(name);
		h.searchbtn();
		Productpage p=new Productpage(driver);
		p.productbtn();
	
	}

}

