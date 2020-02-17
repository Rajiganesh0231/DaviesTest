package maven.demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.ToIntFunction;

import org.eclipse.jetty.websocket.api.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;
@Test
public class TeCl {
	
	
		

		public WebDriver driver ;
		
	

	@Test
	public void math() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://davies-group.com/");	
    	
    	driver.manage().window().maximize();
    	String tabcou = driver.getWindowHandle();
    	  //driver.findElement(by.xpath(" //*[@class='eut-menu-options']/child::li[3]//*[@ href='https://uk.linkedin.com/company/davies-group-loss-adjusters']")).click();
    	  Actions build = new Actions(driver);
    	double t =15.69;
    	int y =(int)t;
    	 
    	  build.moveToElement(driver.findElement(By.xpath("//*[@class='eut-menu-options']/child::li[3]//*[@ href='https://uk.linkedin.com/company/davies-group-loss-adjusters']"))).click().build().perform();
    	  
    	 build.moveToElement(driver.findElement(By.xpath("//*[@class='eut-menu-options']/child::li[2]//*[@ href='https://twitter.com/Davies_Group']"))).click().build().perform();
    	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    	  driver.switchTo().window(tabcou);
    	  build.moveToElement(driver.findElement(By.xpath("//*[@class='eut-menu-options']/child::li[1]//*[@ href='#eut-search-modal']"))).click().build().perform();
    	 // driver.findElement(By.xpath("//*[@class='eut-stretched']/child::div[1]//*[@class='eut-search-placeholder eut-h1 hide']//following::input")).click();
    	  
    	  driver.findElement(By.xpath("//*[@class='eut-stretched']/child::div[1]")).click();
    	 
    	  
    	  driver.findElement(By.xpath("//*[@class='eut-stretched']/child::div[1]//following::input")).sendKeys("Insurance");
    	  
    	  driver.findElement(By.xpath("//*[@class='eut-stretched']/child::div[1]//following::input[2]")).click();
    	  driver.findElement(By.xpath("//*[@class='search search-results wpb-js-composer js-comp-ver-5.2 vc_responsive']//following::div[42]//*[@href='https://davies-group.com/insurance-services/'][1]/*")).click();
    	  driver.findElement(By.xpath("//*[@class='page-template-default page page-id-3903 wpb-js-composer js-comp-ver-5.2 vc_responsive']//following::div//*[@class='eut-fullwidth']//div//div//div//div//following::div//*[@class='eut-button-icon']")).click();
    	  WebElement ele = driver.findElement(By.xpath("//*[@class='eut-advanced-menu-button hide']//following::nav[1]//following::ul/child::li[4]"));
    	  build.moveToElement(ele).build().perform();
    	  
    	  
    	  driver.findElement(By.xpath("//*[@class='eut-advanced-menu-button hide']//following::nav[1]//following::ul/child::li[4]//*[text()='About Us']//following::ul/child::li[3]/child::a[1]//*[text()='Locations']")).click();
    	  
    	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	  
    	  js.executeScript("window.scrollTo(0,500)");
    	  for(int i=0; i<2; i++){ 
    	  driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
    	  }
    	  
    			  
    			  
    	  driver.findElement(By.xpath("//*[@name='gmimap20']//*[@title='Stoke on Trent']")).click();
    	  
    	 
    	  driver.findElement(By.xpath("//*[@name='gmimap20']//*[@title='Stoke on Trent']//following::div//*[@class='gm-style-iw-d']/*/child::div[1]")).getText();
    	  
    	
	}

}
