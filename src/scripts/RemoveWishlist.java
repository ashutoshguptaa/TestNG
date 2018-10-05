package scripts;


import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import POM.AddWishlistpage;
import POM.Homepage;
import POM.Loginpage;
import POM.Logoutpage;
import POM.Productpage;
import POM.RmvWishlstpage;
import generic.Baseclass;
import generic.Excel;

public class RemoveWishlist extends Baseclass {

	@Test
	public void removeWishlist(){
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
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		AddWishlistpage w=new AddWishlistpage(driver);
		w.addwishlistbtn();
		w.checkwishlistbtn();
		RmvWishlstpage rvw= new RmvWishlstpage(driver);
		rvw.rmvwishlist(driver);
		
		
		
}
}		