package gitTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginFacebook {
    @Test
	public void login(){
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
	}

}
