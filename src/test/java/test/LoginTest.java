package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {
	
	WebDriver driver;
	ExcelReader reader = new ExcelReader(".\\Data\\Techfios.xlsx");
	String username = reader.getCellData("LoginInfo", "UserName", 2);
	String password = reader.getCellData("LoginInfo", "Password", 2)	;	
	@Test
	public void userShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		//LoginPage login = new LoginPage();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.clickSignInButton();
		
		
	}

}
