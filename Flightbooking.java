package againnnn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flightbooking {

	    public static void main(String[] args) throws InterruptedException {

	       
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com/");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
//	    driver.navigate().to("https://www.flipkart.com/travel/flights");
	    
	    driver.navigate().to("https://www.flipkart.com/");
	    
	    Thread.sleep(2000);
	    
//	    driver.findElement(By.linkText("✕")).click();
	    driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
	    
        driver.findElement(By.linkText("Travel")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.name("0-departcity")).sendKeys("Mumbai");
        
        Thread.sleep(2000);
        
        driver.findElement(By.name("0-departcity")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        
        driver.findElement(By.name("0-arrivalcity")).sendKeys("Bangkok");
        
        Thread.sleep(2000);
        
        driver.findElement(By.name("0-arrivalcity")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        
        Thread.sleep(2000);
        
//        driver.findElement(By.xpath("//input[@placeholder='Depart On']")).click();
        
        driver.findElement(By.xpath("//input[@name='0-datefrom']")).click();
        
        JavascriptExecutor j  =  (JavascriptExecutor)driver; 
        
        j.executeScript("window.scrollBy(0,150)");
        
        driver.findElement(By.xpath("//button[contains(@class,'Yuvowl')][starts-with(normalize-space(.),'"+5+"')]")).click();
        
        driver.findElement(By.xpath("//input[@name='0-travellerclasscount']"));
       
        
        driver.findElement(By.xpath("//div[text()='Premium Economy']")).click();
        
        driver.findElement(By.xpath("//button[text()='Done']")).click();
        
        Thread.sleep(2000);
        
//        driver.findElement(By.linkText("SEARCH")).click();
        
        driver.findElement(By.xpath("//button[@type='button']")).click();
        
        Thread.sleep(2000);
        
        JavascriptExecutor k  =  (JavascriptExecutor)driver; 
        
        k.executeScript("window.scrollBy(0,1000)");
         
        Thread.sleep(2000); 
        
        j.executeScript("window.scrollBy(0,-1000)");
        
        
        
        driver.close();
        
	
		System.out.println("Select your flight which one you like to book");
		
	}

}
