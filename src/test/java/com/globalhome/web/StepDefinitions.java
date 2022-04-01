package com.globalhome.web;

import com.globalhome.web.pages.GlobalMyStorePage;
import com.globalhome.web.utilities.DriverProvider;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
        private final GlobalMyStorePage MyStoreProductPage;

        //Constructor
        public StepDefinitions(){
            MyStoreProductPage = new GlobalMyStorePage(DriverProvider.getDriver());
        }

        @Given("User is on my store product home page")
        public void user_Is_On_My_Store_Product_Home_Page() {
            MyStoreProductPage.openStartPage();
        }


    }
