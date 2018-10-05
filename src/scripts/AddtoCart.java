package scripts;

import org.testng.annotations.Test;
import POM.Cartpage;
import POM.Homepage;
import POM.Loginpage;
import POM.Logoutpage;
import POM.Productpage;
import generic.Baseclass;
import generic.Excel;

public class AddtoCart extends Baseclass {

	 @Test 
	 public void addtoCart()
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
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Cartpage c=new Cartpage(driver);
		c.addcartbtn();
		
	
		
	}

}

