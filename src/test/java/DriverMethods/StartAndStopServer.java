package DriverMethods;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class StartAndStopServer {

	public static void main(String[] args) {
		AppiumDriverLocalService server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.usingPort(4723)
				.withLogFile(new File("../Appium3332/Logs.txt")));
		server.start();
		server.stop();
    
	}

}
