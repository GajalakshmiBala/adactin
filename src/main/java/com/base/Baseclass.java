package com.base;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mongodb.MapReduceCommand.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	public static void get(String url) {
		driver.get(url);
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void title() {
		driver.getTitle();
	}
	public static void currentUrl() {
		driver.getCurrentUrl();
	}
	public static void windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
	}
	public static void enabled(WebElement element) {
		boolean check = element.isEnabled();
		System.out.println(check);
	}
	public static void displayed(WebElement element) {
		element.isDisplayed();
	}
	public static void selected(WebElement element) {
		element.isSelected();
	}
	public static void tagName(WebElement element) {
		String name = element.getTagName();
		System.out.println(name);
	}
	public static void attribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}
	public static void inputValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void text(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
		public static void dropDown(String options, WebElement element, String value) {
		Select s = new Select(element);
		if(options.equalsIgnoreCase("Select By Value")) {
			s.selectByValue(value);
		}else if(options.equalsIgnoreCase("Select By Index")) {
			int data = Integer.parseInt(value); 
					s.selectByIndex(data);
		}else if(options.equalsIgnoreCase("Select by Text")) {
			s.selectByVisibleText(value);
		}else {
			System.out.println("Invalid Selection");
		}}
		public static void multipleDropDown(WebElement element,String value,int index,String text ) {
		Select s = new Select (element);
		s.selectByIndex(index);
		s.selectByValue(value);
		s.selectByVisibleText(text);
		boolean multiple = s.isMultiple();
		System.out.println("multi drop down is Enabled:" +multiple);
		}
		public static <WebElements> void list(WebElement element) {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions) {
				System.out.println("Selected Options are:" +webElement.getText());
			}
		}	
		public static void alertAccept(String alert){
			Alert a = driver.switchTo().alert();
			a.accept();
		}
		public static void screenshot(WebElement element, String value) {
			TakesScreenshot s = (TakesScreenshot)driver;
			File source = s.getScreenshotAs(OutputType.FILE); 
			File destination = new File("C:\\Users\\Gaja\\eclipse-workspace\\AdactinCucumber\\Screenshot\\ "+value+".png");
			FileUtils.copyFile(source, destination);
		}
	public static void Actions() {
		
		}
		
		
	
		
		
		
		}



