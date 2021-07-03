package com.amazon.automation.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleAutomationFireFoxStepDefinitions {


    public WebDriver driver;

    @Given("^that a test is a displayed in different browsers fire fox$")
    public void thatATestIsADisplayedInDifferentBrowsersFireFox() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");


    }

    @When("^perform different actions at the same time fire fox$")
    public void performDifferentActionsAtTheSameTimeFireFox() {
        // assertEquals(driver.findElement(By.xpath("//h3[text()='CREATE ACCOUNT']")).getText(),"CREATE ACCOUNT");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("google home mini");
        //Le daremos enviar o submit, que replica un click y el cual es usado en formularios
        driver.findElement(By.id("nav-search-submit-button")).submit();
        //Esperamos 2 seg


    }
        @Then("^he will have to look for different products fire fox$")
        public void heWillHaveToLookForDifferentProductsFireFox() {
            driver.close();
        }

    }

