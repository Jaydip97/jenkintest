package testngnew;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.JCommander.Builder;

public class jd1 {
	
	   WebDriver driver;
	   
	  @BeforeMethod
	  public void setup() {
		  ChromeOptions co= new ChromeOptions();
	         co.addArguments("--remote-allow-origins=*");
	         driver=new ChromeDriver(co);
	         driver.get("https://the-internet.herokuapp.com/");
		  
	  }
	  

	  @Test
	  public void a() {
		 
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	         
	         driver.get("https://the-internet.herokuapp.com/");
	          driver.findElement(By.linkText("Multiple Windows")).click();
	          driver.findElement(By.linkText("Click Here")).click();
	          Set<String> id=driver.getWindowHandles();
	          Iterator<String> jd=id.iterator();
	          String parentid=jd.next();
	          String childid=jd.next();
	          
	          
	           driver.switchTo().window(childid);
	           driver.findElement(By.tagName("h3")).getText();
	           System.out.println(driver.findElement(By.tagName("h3")).getText());
	            driver.switchTo().window(parentid);
	          System.out.println( driver.findElement(By.tagName("h3")).getText() );
	  }
	  
//	     @Test
//	     
//	     public void b() {
//	    	 
//	    	 
//	         
//	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//	         
//	         
//	         driver.findElement(By.linkText("Frames")).click();
//	         driver.findElement(By.linkText("Nested Frames")).click();
//	         driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='frame-top']")));
//	        // driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='frameset-middle']")));
//	         driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='frame-middle']")));
//             driver.findElement(By.tagName("body")).getText();
//             System.out.println(driver.findElement(By.tagName("body")).getText());
//	         
//
//	    	 
//	     }
	     
//	     @Test
//	     public void c()  {
//	    	 
//	    	
//	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//	         
//	        
//	         driver.findElement(By.linkText("Drag and Drop")).click();
//	         WebElement j=driver.findElement(By.cssSelector("div#column-a"));
//	         WebElement d=driver.findElement(By.cssSelector("div#column-b"));
//	         
//	         Actions br=new Actions(driver);
//	 		
//
//	         br.dragAndDrop(j, d).build().perform();
//	    	 
//	     }
	
//	 @Test
//	  public void d() {
//		 
//          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//         
//         
//         List<WebElement> ele=driver.findElements(By.tagName("a"));
//         for(int i=0;i<ele.size();i++) {
//        	 String url=ele.get(i).getAttribute("href");
//        	 System.out.println(url);
//         }
//         driver.findElement(By.linkText("Hovers")).click();
//         SoftAssert soft=new SoftAssert();
//         
//         soft.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/hovers");
//         System.out.println(driver.getCurrentUrl());
//           soft.assertAll();
//         Actions jd=new Actions(driver);
//       WebElement a=  driver.findElement(By.xpath("(//*[@alt='User Avatar'])[1]"));
//           jd.moveToElement(a).build().perform();
//           driver.findElement(By.linkText("View profile")).click();
//           driver.findElement(By.tagName("h1")).getText();
//           System.out.println(driver.findElement(By.tagName("h1")).getText());
//	 }
//	 
//	  @Test
//	   public void f() throws InterruptedException {
//		  driver.get("https://www.google.com/");
//		  driver.findElement(By.partialLinkText("Gmail")).click();
//		  
//	  }
//	  @Test
//	   public void g() throws InterruptedException {
//		  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		  driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
//		  driver.switchTo().alert().dismiss();
//	  }
}
