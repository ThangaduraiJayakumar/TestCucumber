package com.selenium.Cucumbertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TestCucumber {
public static WebDriver driver;

@Given("^Open guru demo site$")
public void open_guru_demo_site() {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thangadurai\\Desktop\\Durai java files\\SeleniumJAR\\Driver\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("http://demo.guru99.com/V4/");
}

@When("^Enter username,password and click login button$")
public void enter_username_password_and_click_login_button() {
    driver.findElement(By.name("uid")).sendKeys("mngr165071");
    driver.findElement(By.name("password")).sendKeys("qUpuver");
    driver.findElement(By.name("btnLogin")).click();
}

@Then("^open demo site home page and check the url$")
public void open_demo_site_home_page_and_check_the_url() {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertEquals("http://demo.guru99.com/V4/manager/Managerhomepage.php", driver.getCurrentUrl());
}

}
