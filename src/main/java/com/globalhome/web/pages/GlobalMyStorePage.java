package com.globalhome.web.pages;

import com.globalhome.web.base.BasePage;
import com.globalhome.web.utilities.PropertiesProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlobalMyStorePage extends BasePage{


    protected final String headerCookies = "OUR COOKIES";


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

// Select the Product category:
    public void selectTheProductType(String productType) {
        checkIfTextIsExpected(productTypeElement, productType);
        clickOn(productTypeElement);
        waitUntilUrlContains("home-garden");
    }

// Select the Product SubCategory:
    public void selectTheSubProduct(String subProduct) {
        checkIfTextIsExpected(subProductElement, subProduct);
        clickOn(subProductElement);
        waitUntilUrlContains("bbqs");
    }

// Sort the Product by Price Low to High:
    public void sortBy(String sortByValue) {
        waitUntilElementClickable(sortByValueElement);
        selectByVisibleTextInDropDown(sortByValueElement, sortByValue);
        waitUntilUrlContains("bbqs");
        waitUntilUrlContains("sortBy");
    }

// Select the Product(Item):
    public void selectProductName(String productName, String productPage) {
        imgXpath=imgXpathPrefix + productName + imgXpathSuffix;
        productImageElement=find_element_by_xpath(imgXpath);
        waitUntilElementClickable(productImageElement);
        clickOn(productImageElement);
        waitUntilUrlContains(productPage);
    }

// Add the selected product into the basket:
    public void selectAddToBasket(String addBasket, String productPage) {
        waitUntilElementClickable(addToBasketElement);
        waitUntilUrlContains(productPage);
        focusAndClickElement(addToBasketElement);
    }

// Verify the Successfully Added the Product:
    public void successfullyAddedToBasket(String addedToTheBasket, String productPage) {
        waitUntilElementVisible(addedToTheBasketElement);
        checkIfTextIsExpected(addedToTheBasketElement, addedToTheBasket);
        waitUntilUrlContains(productPage);
    }

// Open the Basket:
    public void opensBasket(String productName,String onPage) {
        checkIfTextIsExpected(goToYourBasketElement,"Go to your basket");
        focusAndClickElement(goToYourBasketElement);
        waitUntilUrlContains(onPage);
    }

// Click the Continue Checkout Button:
    public void continueCheckout(String continueCheckout) {
        checkIfTextIsExpected(continueCheckoutElement,continueCheckout);
        focusAndClickElement(continueCheckoutElement);
    }

}
