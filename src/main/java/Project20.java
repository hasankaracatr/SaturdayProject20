

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public  class Project20 {
    WebDriver driver;
    WebDriverWait wait;

    public void clickTo(By selector) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.click();
    }

    public void sendKeysTo(By selector, String data) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.sendKeys(data);
    }


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 5);

        driver.get("https://test.campus.techno.study/");
        // Dismiss the cookie message by clicking on "Got it!" button
        driver.findElement(By.cssSelector("a[aria-label=\"dismiss cookie message\"]")).click();
    }

    @Test
    public void Test1_login() {
        driver.findElement(Selectors.username).sendKeys("daulet2030@gmail.com");
        driver.findElement(Selectors.password).sendKeys("TechnoStudy123@");
        driver.findElement(Selectors.loginButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(Selectors.menu));
    }

    @Test
    public void Test2_Employees() {
        wait.until(ExpectedConditions.elementToBeClickable(Selectors.HumanResources));
        driver.findElement(Selectors.HumanResources).click();
        wait.until(ExpectedConditions.elementToBeClickable(Selectors.Employees));
        driver.findElement(Selectors.Employees).click();
        wait.until(ExpectedConditions.elementToBeClickable(Selectors.TrippleDot));
        driver.findElement(Selectors.TrippleDot).click();
        wait.until(ExpectedConditions.elementToBeClickable(Selectors.TextFile));
        driver.findElement(Selectors.TextFile).click();
    }
}
/*
This project does not require Page Object Model
You do not have to use Cucumber (Java, Selenium and TestNG seem pretty enough but you are free to use other tools too)
You will need to use ApachePOI libraries to handle excel file

- Setup your project (dependencies, driver, etc)

- Login to https://test.campus.techno.study

- Navigate to Employees page under Human Resources menu

- Click on the three dots button on the left bottom of the Employees page

- Click on Excel Export and save the excel file about the employees listed in the page
  By default, there will be info (No, Full Name, Status, Employee Type, Gender) about first 10 employees in the excel file.

- (Optional step!) Try to save the excel file into a folder whose path is defined by you.
  So that, your test will not depend on Download folder in your computer but can be downloaded in a folder we define.
  This will be very helpful since this test will not be specific to your computer but it can run in any computer.

- Read from the excel file and to validate all the information on the Employees page correctly saved/exported.
  The way you validate each info is up to you! You are the tester.
  (Obviously the photos will not be in the excel file, ignore the photos. Selenium cannot test the graphical content anyway)

- (Optional) Try to use only only one test case because you are actually testing only one thing: Export Excel functionality

Good luck!
 */
