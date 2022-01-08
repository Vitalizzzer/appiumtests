package com.appiumdemo.common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseActions {

    protected AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void openMusicPlayer() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 9 Pro");
        cap.setCapability(MobileCapabilityType.UDID, "192.168.0.162:5555");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11 RKQ1.200826.002");

        cap.setCapability("appPackage", "com.miui.player");
        cap.setCapability("appActivity", "com.miui.player.ui.MusicActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        System.out.println("Application started...");
        driver = new AppiumDriver<>(url, cap);
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
