package com.adactin.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Adactin_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactinstepdefinition {
	public static WebDriver driver = Adactin_Runner.driver;
	@Given("^user launch the URL$")
	public void user_launch_the_URL() throws Throwable {
		driver.get("https://adactinhotelapp.com");
	}
	
	@Given("^user gives username$")
	public void user_gives_username() throws Throwable {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Gajalakshmibalaji");	
	}

	@When("^user gives password$")
	public void user_gives_password() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("288I6Q");
	}

	@When("^user clicks login$")
	public void user_clicks_login() throws Throwable {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@Given("^user gives the location$")
	public void user_gives_the_location() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("Sydney");
	}

	@When("^user gives the hotel name$")
	public void user_gives_the_hotel_name() throws Throwable {
		WebElement Hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(Hotel);
		s1.selectByIndex(1);
	}

	@When("^user gives the room type$")
	public void user_gives_the_room_type() throws Throwable {
		WebElement Roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(Roomtype);
		s2.selectByVisibleText("Standard");
	}

	@When("^user gives the Room number$")
	public void user_gives_the_Room_number() throws Throwable {
		WebElement Roomno = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(Roomno);
		s3.selectByIndex(1);
	}

	@When("^user gives check in date$")
	public void user_gives_check_in_date() throws Throwable {
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.clear()	;
		checkin.sendKeys("28/01/2023");
	}

	@When("^user gives check out date$")
	public void user_gives_check_out_date() throws Throwable {
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear()	;
		checkout.sendKeys("30/01/2023");
	}

	@When("^user gives the adult per room$")
	public void user_gives_the_adult_per_room() throws Throwable {
		WebElement adultperroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select (adultperroom);
		s4.selectByIndex(2);
	}

	@When("^user gives child per room$")
	public void user_gives_child_per_room() throws Throwable {
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select (child);
		s5.selectByIndex(1);
	}

	@Then("^user clicks search$")
	public void user_clicks_search() throws Throwable {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
	}

	@Given("^user selects the hotel$")
	public void user_selects_the_hotel() throws Throwable {
		WebElement select = driver.findElement(By.id("radiobutton_0"));
		select.click()	;
	}

	@Given("^user clicks continue button$")
	public void user_clicks_continue_button() throws Throwable {
		WebElement contin = driver.findElement(By.id("continue"));
		contin.click();
	}

	@Given("^user gives firstname$")
	public void user_gives_firstname() throws Throwable {
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys("Gaja");
	}

	@Given("^user gives lastname$")
	public void user_gives_lastname() throws Throwable {
		WebElement last = driver.findElement(By.name("last_name"));
		last.sendKeys("lakshmi");
	}

	@Given("^user gives Address$")
	public void user_gives_Address() throws Throwable {
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("Aminjikarai");
	}

	@Given("^user gives card type$")
	public void user_gives_card_type() throws Throwable {
		WebElement cctype = driver.findElement(By.id("cc_num"));
		cctype.sendKeys("9879765432134568");
	}

	@Given("^user gives card no$")
	public void user_gives_card_no() throws Throwable {
		WebElement ccno = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(ccno);
		s6.selectByValue("AMEX");
	}

	@Given("^user gives expiry date$")
	public void user_gives_expiry_date() throws Throwable {
		WebElement exmonth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(exmonth);
		s7.selectByIndex(2);
	}

	@Given("^user gives  expiry year$")
	public void user_gives_expiry_year() throws Throwable {
		WebElement exyear = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(exyear);
		s8.selectByIndex(10);
	}

	@Given("^user gives ccv number$")
	public void user_gives_ccv_number() throws Throwable {
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys("1234");
	}

	@Then("^user gives book now$")
	public void user_gives_book_now() throws Throwable {
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		Thread.sleep(5000);
	}

	@Given("^user gives logout$")
	public void user_gives_logout() throws Throwable {
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();
	}

}
