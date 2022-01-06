package com.appiumdemo;

import com.appiumdemo.common.CommonActions;
import com.appiumdemo.pages.AgreementPage;
import com.appiumdemo.pages.PlayingSongPage;
import com.appiumdemo.pages.SongsListPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CalculatorTest {

    // WebDriver driver;
    // AndroidDriver driver;
    private AppiumDriver<MobileElement> driver;
    private final CommonActions commonActions = new CommonActions();

    @BeforeTest
    public void init() throws MalformedURLException{
        driver = commonActions.openMusicPlayer();
    }

    @Test
    public void playPauseMusic() throws InterruptedException {
        AgreementPage agreementPage = new AgreementPage(driver);
        SongsListPage songsListPage = agreementPage.confirmAgreement();
        PlayingSongPage playingSongPage = songsListPage.playFirstSong();
        Thread.sleep(5000);
        playingSongPage.clickPlayBtn();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
