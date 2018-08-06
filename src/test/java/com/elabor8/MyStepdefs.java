package com.elabor8;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.junit.Test;

public class MyStepdefs {
    MarketList _list;

    @When("^I create a new list$")
    public void WhenICreateANewList() throws Throwable {
        _list = new MarketList();
    }


    @Then("^the list has no contents$")
    public void ThenTheListHasNoContents() throws Throwable {
        Assert.assertTrue("Market List is Empty", _list.Contents.isEmpty());
    }

    @When("^I add an product to the list$")
    public void WhenIAddAnProductToTheList() throws Throwable {
        MarketProduct product = new MarketProduct();
        _list.Add(product);
    }

    @Then("^the list contains the product added$")
    public void ThenTheListContainsTheProductAdded() throws Throwable {
        //Assert.IsNotEmpty(_list.Contents);
        Assert.assertFalse("Market List is not empty", _list.Contents.isEmpty());
    }


    @When("^I add (.*) Cookies to the list$")
    public void WhenIAddCookiesToTheList(int p0)
    {
        MarketProduct product = new MarketProduct("Cookie", p0);
        _list.Add(product);
    }

    @Then("^the list contains a quantity of (.*) cookies$")
    public void ThenTheListContainsAQuantityOfCookies(int p0)
    {
        Assert.assertEquals(_list.GetQuantity("Cookie"), p0);
    }

    @Given("^I add (.*) '(.*)'$")
    public void GivenIAdd(int p0, String p1)
    {
        MarketProduct product = new MarketProduct(p1, p0);
        _list.Add(product);
    }

    @Then("^the list contains a quantity of (.*) '(.*)'$")
    public void ThenTheListContainsAQuantityOf(int p0, String p1)
    {
        Assert.assertEquals(_list.GetQuantity(p1), p0);
    }

    @When("^I remove '(.*)' from the list$")
    public void WhenIRemoveFromTheList(String p0)
    {
        _list.Remove(p0);
    }

    @Then("^the list doesnt contains '(.*)'$")
    public void ThenTheListDoesntContains(String p0)
    {
        Assert.assertEquals(_list.GetQuantity(p0), 0);
    }

    @When("^I remove (.*) '(.*)' from the list$")
    public void WhenIRemoveFromTheList(int p0, String p1)
    {
        _list.Remove(p1, p0);
    }
}
