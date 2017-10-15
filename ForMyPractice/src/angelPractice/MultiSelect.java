package angelPractice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.navigate().to("http://toolsqa.com/automation-practice-form/");
     Select dselect=new Select(driver.findElementById("selenium_commands"));
     dselect.isMultiple();
     dselect.selectByIndex(0);
     dselect.selectByIndex(2);
     dselect.selectByIndex(3);
     List<WebElement> lst= dselect.getAllSelectedOptions();
     
     for (WebElement each : lst) {
    	 
    	 System.out.println(each.getText());
    		 
    	 }
		
	}
     
     

	}


