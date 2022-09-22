package pomRepository;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginGeneralStore {
	AndroidDriver driver;
public LoginGeneralStore(AndroidDriver driver) {
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);

}
@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
private MobileElement dropdown;

@AndroidFindBy(xpath="//android.widget.TextView[@text='India']")
private MobileElement country;

@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
private MobileElement name;

@AndroidFindBy (id="com.androidsample.generalstore:id/btnLetsShop")
private MobileElement letsshop;
public MobileElement getDropdown() {
	return dropdown;
}

public MobileElement getCountry() {
	return country;
}

public MobileElement getName() {
	return name;
}

public MobileElement getLetsshop() {
	return letsshop;
}

public void loginAction(String name) {
	dropdown.click();
	
}


}














