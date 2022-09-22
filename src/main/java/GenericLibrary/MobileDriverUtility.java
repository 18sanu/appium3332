package GenericLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.Connection;

public class MobileDriverUtility {
	 AndroidDriver driver=BaseClass.sdriver;
	
public void getMobileDataOn() {
	   driver.setConnection(Connection.DATA);//
	   
}
public void getAirplaneModeOn() {
	driver.setConnection(Connection.AIRPLANE);
}
public void getWifiOn() {
	driver.setConnection(Connection.WIFI);
}

public void openNotification() {
	driver.openNotifications();
}
public List<AndroidElement>  readNotificationTitle() {
	
	List<AndroidElement> titles = driver.findElements(By.id("android:id/title"));
return titles;	
}
public List<AndroidElement>  readNotificationText() {
	
	List<AndroidElement> texts = driver.findElements(By.id("android:id/text"));
return texts;	
}
public void zoomInImage(WebElement element) {
	driver.zoom(element);
}
public void zoomOutImage(WebElement element) {
	driver.pinch(element);
}
public void landscapeMode() {
	driver.rotate(ScreenOrientation.LANDSCAPE);
}
public void portraitMode() {
	driver.rotate(ScreenOrientation.PORTRAIT);
}
public void scrollAction(String attributeName,String attributeValue) {
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+attributeName+"(\""+attributeValue+"\"))");
}
public void hideKeyboard() {
	driver.hideKeyboard();
}
public void dragAndDrop(WebElement src,WebElement dest) {
	TouchAction t = new TouchAction(driver);
	t.longPress(dest).waitAction().moveTo(dest).perform().release();
}
 
public void clickOnElement(int finger,WebElement element,int duration) {
	driver.tap(finger, element,duration);
}

public void clickOnElement(int finger,int x,int y,int duration) {
	driver.tap(finger,x,y, duration);
}
public void installApp(String path) {
	driver.installApp(path);
}
public void uninstallApp(String packageName) {
	driver.removeApp(packageName);
}
public boolean isAppInstalled(String packageName) {
	return driver.isAppInstalled(packageName);
}
public void swipeAction(int x1,int y1,int x2,int y2,int duration) {
	driver.swipe(x1, y1, x2, y2, duration);
}
public void runAppInBackground(int duration) {
	driver.runAppInBackground(duration);
}

}
