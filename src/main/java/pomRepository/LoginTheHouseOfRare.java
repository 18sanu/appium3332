package pomRepository;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginTheHouseOfRare {
	AndroidDriver driver;
	public LoginTheHouseOfRare(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
      
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@resource-id=\"android:id/text1\"]")
	private MobileElement storeRareRabbit;
	
    
	@AndroidFindBy(id="rarerabbit.android.app:id/imageView_navigation_view")
	private MobileElement MenuBarImg;
	
	@AndroidFindBy(id="rarerabbit.android.app:id/textView_left_title")
	private MobileElement loginButton;
	
	@AndroidFindBy(id="rarerabbit.android.app:id/editTxt_edit_username")
	private MobileElement email;
	
	@AndroidFindBy(id="rarerabbit.android.app:id/editTxt_password")
	private MobileElement password;
	
	@AndroidFindBy(id="rarerabbit.android.app:id/btn_login")
	private MobileElement login;
	public MobileElement getStoreRareRabbit() {
		return storeRareRabbit;
	}

	public MobileElement getMenuBarImg() {
		return MenuBarImg;
	}

	public MobileElement getLoginButton() {
		return loginButton;
	}

	public MobileElement getEmail() {
		return email;
	}

	public MobileElement getPassword() {
		return password;
	}

	public MobileElement getLogin() {
		return login;
	}
	
	public void LoginAction(String username,String password) throws InterruptedException {
		
		storeRareRabbit.click();
		Thread.sleep(5000);
		MenuBarImg.click();
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		email.sendKeys(username);
		Thread.sleep(2000);
		this.password.sendKeys(password);
		Thread.sleep(2000);
		login.click();
	}
	
	
	
	
	
	
	
	
	
}
