package com.demoblaze.stepdefinitions;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class TestStepDefinitons {
    ProductPage productPage = new ProductPage();

    @Given("buyer is home page of demoblaze")
    public void buyer_is_home_page_of_demoblaze() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }
    @When("buyer add from {string} catagory {string} product to card")
    public void buyer_add_from_catagory_product_to_card(String catagory, String cart) {
        productPage.getLink(catagory);
        productPage.getLink(cart);
        productPage.getLink("Add to cart");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();


    }
    @When("buyer click on  {string} link")
    public void buyer_click_on_link(String link ) {
        productPage.getLink(link);

    }

}
