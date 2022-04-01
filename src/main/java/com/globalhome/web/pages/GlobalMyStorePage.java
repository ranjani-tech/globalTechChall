package com.globalhome.web.pages;

import com.globalhome.web.base.BasePage;
import com.globalhome.web.utilities.PropertiesProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GlobalMyStorePage extends BasePage {

    //constructor
    public GlobalMyStorePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Navigate to HomePage:
    public void openStartPage() {
        goToWeb(PropertiesProvider.getProperties().getProperty("starturl"));
        waitUntilUrlContains(PropertiesProvider.getProperties().getProperty("starturl"));
    }

}