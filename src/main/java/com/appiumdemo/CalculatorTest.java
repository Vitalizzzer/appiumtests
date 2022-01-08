package com.appiumdemo;

import com.appiumdemo.common.BaseActions;
import com.appiumdemo.pages.AgreementPage;
import com.appiumdemo.pages.PlayingSongPage;
import com.appiumdemo.pages.SongsListPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CalculatorTest extends BaseActions{

    @Test
    public void playPauseMusic() throws InterruptedException {
        AgreementPage agreementPage = new AgreementPage(driver);
        SongsListPage songsListPage = agreementPage.confirmAgreement();
        PlayingSongPage playingSongPage = songsListPage.playFirstSong();
        Thread.sleep(5000);
        playingSongPage.clickPlayBtn();
    }
}
