package scripts;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import POM.Homepage;
import POM.Invalidpincodepage;
import POM.Loginpage;
import POM.Logoutpage;
import POM.Productpage;
import generic.Baseclass;
import generic.Excel;

public class Invalidpincode extends Baseclass  {

	 @Test 
	 public void invalidpincode()
	 {
		String us = Excel.abc(excelpath,"Sheet1",1,0);
		String pass = Excel.abc(excelpath,"Sheet1",1,1);
		String name = Excel.abc(excelpath,"Sheet1",1,2);
		
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
		Invalidpincodepage z=new Invalidpincodepage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		z.enterzipcode();
		z.zipsubmitbtn();
	
	}
}	