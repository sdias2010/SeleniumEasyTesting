package com.seleniumeasy.steps.stepdefs;

import com.seleniumeasy.pages.HomePage;
import com.seleniumeasy.pages.SimpleFormDemoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SimpleFormDemoMyStepdefs {

    HomePage homePage = new HomePage(Hooks.testDriver);
    SimpleFormDemoPage simpleFormdemo = new SimpleFormDemoPage(Hooks.testDriver);

    @Given("user has opened the Simple Form Demo Page")
    public void userHasOpenedTheSimpleFormDemoPage() {
        homePage.navigatetoSimpleFormDemo();
        System.out.println("Opening Simple Form Demo");
    }

    @When("user enters the message in the text box {string}")
    public void userEntersTheMessageInTheTextBox(String _usermessage) {
        simpleFormdemo.enterUserMessage(_usermessage);
        System.out.println("Entered the text -"+_usermessage);
    }

    @Then("click on Show Message button")
    public void clickOnShowMessageButton() {
        simpleFormdemo.clickShowMessage();
        System.out.println("Clicked on Show Message button");
    }

    @And("your message displays again {string}")
    public void yourMessageDisplaysAgain(String _displaymessage) {
        Assert.assertEquals(simpleFormdemo.getDisplayMessage(), _displaymessage);
        System.out.println("Entered message is - "+_displaymessage);
    }

    @When("user enters the value a {string}")
    public void userEntersTheValueA(String _valueA) {
        simpleFormdemo.entervaluefora(_valueA);
    }

    @And("user enters the value b {string}")
    public void userEntersTheValueB(String _valueB) {
        simpleFormdemo.entervalueforb(_valueB);
    }

    @Then("clicks on get total button")
    public void clicksOnGetTotalButton() {
        simpleFormdemo.clickGetTotal();
    }

    @And("total of a + b is displayed {string}")
    public void totalOfABIsDisplayed(String _totalValue) {
        Assert.assertEquals(simpleFormdemo.getTotalValue(), _totalValue);
    }
}
