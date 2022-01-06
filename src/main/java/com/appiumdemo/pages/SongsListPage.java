package com.appiumdemo.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SongsListPage {

    private final WebDriverWait wait;
    private final AppiumDriver<MobileElement> driver;

    public SongsListPage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(id = "com.miui.player:id/local_song_list")
    private MobileElement songList;

    public PlayingSongPage playFirstSong(){
        wait.until(ExpectedConditions.visibilityOf(songList));
        List<MobileElement> songs = songList.findElementsByXPath("//*");
        songs.get(0).click();
        return new PlayingSongPage(driver);
    }
}
