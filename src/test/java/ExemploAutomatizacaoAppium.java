import org.junit.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;


public class ExemploAutomatizacaoAppium {
	
	@Test
	public void primeiroExemplo() throws MalformedURLException {
		
		/*
		 * {
  "appium:platformName": "Android",
  "appium:platformVersion": "17",
  "appium:automationName": "UIAutomator2",
  "appium:deviceName": "emulator-5554",
  "appium:appPackage": "io.appium.android.apis",
  "appium:appActivity": ".ApiDemos"
}
		 */
		UiAutomator2Options options = new UiAutomator2Options();
				options.setPlatformName("Android");
				options.setPlatformVersion("17");
				options.setAutomationName("UIAutomator2");
				options.setDeviceName("emulator-5554");
				options.setAppPackage("io.appium.android.apis");
				options.setAppActivity(".ApiDemos");
				
				AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
				
				driver.findElement(AppiumBy.id("continue_button")).click();
				
				
				
	}
	

}
