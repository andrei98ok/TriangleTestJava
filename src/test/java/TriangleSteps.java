
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class TriangleSteps {
	 private WebDriver driver;
	 
	 @Given("Open Triangle Calculator")
	 public void setUp() {
		 
		 System.setProperty("webdriver.chromedriver","C:\\Users\\besti\\eclipse-workspace\\TriangleTest\\chromedriver.exe"); //Путь до ChromeDriver
		  
		  driver = new ChromeDriver();
		  driver.get("https://www.calculator.net/triangle-calculator.html");
	 }
	 @When("Clear all parameterts")
	 public void clearParam() {
		 
		 driver.findElement(By.cssSelector("input:nth-child(3)")).click();
	 }
	 
	 @And("Set value \"3\" for side \"A\"")
	 public void setA() {
		 
		 driver.findElement(By.name("vx")).sendKeys("3");
}
	 @And("Set value \"3\" for side \"B\"")
	 public void setB() {
		 
		 driver.findElement(By.name("vy")).sendKeys("3");
}
	 @And("Set value \"1\" for side \"C\"")
	 public void setC() {
		 
		 driver.findElement(By.name("vz")).sendKeys("1");
}
	 @And("Click button \"Calculate\"")
	 public void clickButton() {
		 
		 driver.findElement(By.name("x")).click();
}
	 @Then("Result is \"Isosceles triangle\"")
	 public void assertTest () {
		  assertEquals(driver.findElement(By.cssSelector(".bigtext:nth-child(2)")).getText(), "Side a = 3\nSide b = 3\nSide c = 1");
		  driver.close();
	 }
	 
}
