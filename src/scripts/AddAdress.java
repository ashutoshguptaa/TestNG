package scripts;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import POM.AddAdresspage;
import POM.Homepage;
import POM.Loginpage;
import POM.Productpage;
import generic.Baseclass;
import generic.Excel;

public class AddAdress extends Baseclass  {


	@Test  
	public void addAdress()
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
		AddAdresspage ad=new AddAdresspage(driver);
		ad.buynowbtn();
		ad.addaddress();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='SAVE ADDRESS']")).click();
		
	
	}
}