package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber {
	WebDriver driver;
	@Given("The user is in telecom homepage")
	public void the_user_is_in_telecom_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace SECOND\\Cucumber\\src\\test\\resources\\driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("The user is filling all the details")
	public void the_user_is_filling_all_the_details() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Vicknesh");;
		driver.findElement(By.id("lname")).sendKeys("Pandian");
		driver.findElement(By.id("email")).sendKeys("vp@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Tuticorin");
		driver.findElement(By.name("telephoneno")).sendKeys("9486648036");
		
	}

	@When("The use click on submit button")
	public void the_use_click_on_submit_button() {
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	}

	@Then("The user should get displayed the customer ID")
	public void the_user_should_get_displayed_the_customer_ID() {
		
		
	}



}
