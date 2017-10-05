package gitTest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginFacebook {
    @Test
	public void login(){
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://toolsqa.com/automation-practice-form/");
    driver.manage().window().maximize();
    List<WebElement> radios= driver.findElementsByName("exp");
    
    radios.get(radios.size()-1).click();
    
    /*for(int i=0; i<radios.size();i++) 
       {
    	
    	
    	String name=eachRadio.getAttribute("value");
    	
    	
       }*/
    /*for (WebElement eachRadio : radios) {
    	
    	String name=eachRadio.getAttribute("value");
    	
    	if(name.equalsIgnoreCase("Female")){
    		
    		eachRadio.click();
    	}
		
    	eachRadio.click();
	}*/
	  }
	}

