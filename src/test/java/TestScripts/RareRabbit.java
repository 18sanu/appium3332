package TestScripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import pomRepository.LoginTheHouseOfRare;

public class RareRabbit extends BaseClass{
	@Test
	public void buyShirt() throws InterruptedException {
		LoginTheHouseOfRare login = new LoginTheHouseOfRare(driver);
		Thread.sleep(2000);
		login.LoginAction("18sanu.k0@gmail.com", "Sanu@9204");
	}

}
