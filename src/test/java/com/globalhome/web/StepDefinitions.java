package com.globalhome.web;

import com.globalhome.web.pages.GlobalMyStorePage;
import com.globalhome.web.utilities.DriverProvider;
import io.cucumber.java.en.And;
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

    @When("user verify the page title {string}")
    public void userVerifyThePageTitle(String PageTitle) {
            MyStoreProductPage.selectPageTitle(PageTitle);
    }

    @And("user adds")
    public void user_adds(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
    @Then("user should be able to view the item in cart {string} page")
    public void user_should_be_able_to_view_the_item_in_cart_page(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @And("user again add the Faded Short Sleeve T-shirts item in cart {string}")
    public void user_again_add_the_faded_short_sleeve_t_shirts_item_in_cart(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @And("user remove the evening dresses item from cart {string}")
    public void user_remove_the_evening_dresses_item_from_cart(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @And("user validate the summary page")
    public void user_validate_the_summary_page(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
    @And("user verify the {string} button on cart page")
    public void user_verify_the_button_on_cart_page(String string) {
        // Write code here that turns the phrase above into concrete actions
    }

}
