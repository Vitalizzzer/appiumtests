package com.appiumdemo.common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CommonActions {

    public AppiumDriver<MobileElement> openMusicPlayer() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Redmi 9 Pro");
        cap.setCapability("udid", "192.168.0.162:5555");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11 RKQ1.200826.002");

        cap.setCapability("appPackage", "com.miui.player");
        cap.setCapability("appActivity", "com.miui.player.ui.MusicActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        System.out.println("Application started...");
        return new AppiumDriver<>(url, cap);
    }
}
