package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GeneralStorePriceVerify {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();

		// common capability of android

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
    
        
        cap.setCapability("appPackage","com.androidsample.generalstore");
        cap.setCapability("appActivity",".SplashActivity" );
        
        URL url = new URL("http://localhost:4723/wd/hub");
        
        
        AndroidDriver driver =new AndroidDriver (url,cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement dropDown = driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
        driver.tap(1, dropDown, 500);
        
        scrollToElement(driver, "text", "India");
        WebElement india = driver.findElement(By.xpath("//android.widget.TextView[@text='India']"));
        india.click();
        
        WebElement name = driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
        name.sendKeys("sanu");
        
        WebElement letsShop = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
        letsShop.click();
        
       String actualPrice = driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 1 Mid SE']/parent::android.widget.LinearLayout//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productPrice']")).getText();
       
       WebElement addToCart = driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 1 Mid SE']/parent::android.widget.LinearLayout//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']"));
	    addToCart.click();
	    WebElement cart = driver.findElement(By.id("appbar_btn_cart"));
	    cart.click();
	    
	    String cartPrice = driver.findElement(By.id("totalAmountLbl")).getText();
	    System.out.println(cartPrice);
	    if(removeSpace(actualPrice).equals(removeSpace(cartPrice))) {
	    	System.out.println("pass");
	    }
	    else
	    	System.out.println("fail");
	}
	
	public static void scrollToElement(AndroidDriver driver,String an,String av) {
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
	
	public static String removeSpace(String s) {
		return	s.replace(" ", "");
			
		}
		
	
	
	}


