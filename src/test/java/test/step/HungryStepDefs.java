package test.step;

import code.Alvaro;
import code.Eugenio;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HungryStepDefs {
    private Alvaro alvaro = new Alvaro();
    private Eugenio eugenio = new Eugenio(alvaro);


    @Given("Alvaro is hungry")
    public void Alvaro_is_hungry() {
        alvaro.hungry = true;
    }

    @Given("Alvaro is not hungry")
    public void Alvaro_is_not_hungry() {
        alvaro.hungry = true;
    }

    @Given("Eugenio brings (\\d+) cookies")
    public void Eugenio_brings_cookies(int n) {
        eugenio.numberOfCookies = n;
    }

    @When(value = "Alvaro asks for a cookie to Eugenio")
    public void Alvaro_asks_for_a_cookie_to_Eugenio() {
        eugenio.askForCookie();
    }

    @When(value = "Eugenio offers a cookie to Alvaro")
    public void Eugenio_offers_a_cookie_to_Alvaro() {
        eugenio.giveCookie(1);
    }

    @Then("Eugenio has (\\d+) cookies")
    public boolean Eugenio_has_cookies(int n) {
        return eugenio.numberOfCookies == n;
    }

}