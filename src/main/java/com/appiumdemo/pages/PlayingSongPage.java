package com.appiumdemo.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayingSongPage {

    public PlayingSongPage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.miui.player:id/btn_play")
    private MobileElement btnPlay;

    public void clickPlayBtn(){
        btnPlay.click();
    }
}
