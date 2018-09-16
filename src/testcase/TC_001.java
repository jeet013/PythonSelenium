package testcase;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TC_001 {
	@Test
	public void tcase1() 
	{
		File f =new File("C:/Users/jeet0/Desktop/TheTestingWorld.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","VirtualDevice");
		cap.setCapability("platformName", "android");
		cap.setCapability("app", f);		
		
	}
}
