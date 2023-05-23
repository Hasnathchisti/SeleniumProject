package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) {
	
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");
        List <WebElement> links = driver.findElements(By.tagName("a"));
        
       for (WebElement webElement:links) {
    	   
    	  System.out.println(webElement.getText() + " - " + webElement.getAttribute("class"));
       }
      
	}

}
