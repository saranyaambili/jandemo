package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Ahampage;
import utilities.Excelclass;



public class Ahamtest extends Baseclass {
	@Test(priority = 1)
	public void icon() {
		Ahampage ah=new Ahampage(driver);
		ah.logicon();
	}
	
	
	
	
	@Test(priority = 2)
	public void login() throws IOException{
		Ahampage ah1=new Ahampage(driver);
		String excel="C:\\Users\\shilp\\OneDrive\\Desktop\\aham.xlsx";
		String sheet="Sheet1";
		int rowcount=Excelclass.getrowcount(excel, sheet);
		for(int i=1;i<=rowcount;i++) {
			String email=Excelclass.setcellvalue(excel, sheet, i, 0);
			System.out.println("email id is------"+email);
			String password=Excelclass.setcellvalue(excel, sheet, i,1);
			System.out.println("password is-----"+password);
			
			ah1.ahamlogin(email, password);
			ah1.clear();
			
		}

	}
	

}
