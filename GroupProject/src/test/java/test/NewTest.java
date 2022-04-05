package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;
  @Test
  public void f() {
	  WebElement city = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input"));
	  city.sendKeys("mumbai");
	  driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[1]/div/div/img")).click();
	  driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[1]/div/div/img")).click();
	  driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]]")).click();
	  WebElement rrr = driver.findElement(By.cssSelector("#super-container > div.sc-b1h692-2.bjlzfS > div.sc-133848s-2.sc-b1h692-4.gHrdsr > div.sc-b1h692-8.jfArFP > div:nth-child(2) > div > div > div > div.sc-lnhrs7-0.bKwTw > div > div.sc-lnhrs7-2.eQezya > div:nth-child(1) > a > div > div.sc-133848s-2.sc-1t5vwh0-0.kSxFV > div > img"));
	  rrr.click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Drivers2\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.bookmyshow.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
