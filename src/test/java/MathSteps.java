import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class MathSteps {
	 private WebDriver driver;
	 
	 @Given("I use the calculater")
	 public void setUp() {
		 
		 System.setProperty("webdriver.chromedriver","C:\\Users\\besti\\eclipse-workspace\\TriangleTest\\chromedriver.exe"); //Путь до ChromeDriver
		  
		  driver = new ChromeDriver();
		  driver.get("https://www.calculator.net/math-calculator.html");
	 }
	 

	 @When("I enter \"1\" into the calculator")
	 public void i_enter_into_the_calculator(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @When("I add \"200\"")
	 public void i_add(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @When("I subtract \"200\"")
	 public void i_subtract(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @When("I divide by \"500\"")
	 public void i_divide_by(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @When("I multiply by \"500\"")
	 public void i_multiply_by(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("the calculated result is \"1\"")
	 public void the_calculated_result_is(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }
	 
}