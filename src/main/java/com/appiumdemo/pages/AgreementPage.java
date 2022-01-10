package com.appiumdemo.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgreementPage {

    private final WebDriverWait wait;
    private final AppiumDriver<MobileElement> driver;

    public AgreementPage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(id = "com.miui.player:id/chb_all")
    protected MobileElement btnAgreementRadio;

    @FindBy(id = "com.miui.player:id/tv_action")
    protected MobileElement btnAgree;

    public SongsListPage confirmAgreement() {
        wait.until(ExpectedConditions.visibilityOf(btnAgreementRadio));
        btnAgreementRadio.click();
        btnAgree.click();
        return new SongsListPage(driver);
    }
}
