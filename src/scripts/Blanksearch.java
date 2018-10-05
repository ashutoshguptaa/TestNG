package scripts;

import org.testng.annotations.Test;

import POM.Blanksearchpage;
import POM.Loginpage;
import POM.Logoutpage;
import generic.Baseclass;
import generic.Excel;

public class Blanksearch extends Baseclass
{

	@Test
	public void blanksearch()
	{
		String us = Excel.abc(excelpath,"Sheet1",1,0);
		String pass = Excel.abc(excelpath,"Sheet1",1,1);
		
		Loginpage l=new Loginpage(driver);
		l.login_register_btn();
		l.emailaddtb(us);
		l.passwordtb(pass);
		l.login();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Blanksearchpage h=new Blanksearchpage(driver);
		h.searchbtn();
		
	}

}

