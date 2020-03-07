package selenium.sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class Sample4Task {
    WebDriver driver;
    String base_url = "https://uljanovs.github.io/site/examples/actions";

    // method which is being run before each test
    @Before
    public void startingTests() throws Exception {
        // from Sample 1:
        String libWithDriversLocation = System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver.exe");
        // declaration above:
        driver = new ChromeDriver();
        //open page:
        driver.get(base_url);
    }

    // method which is being run after each test
    @After
    public void endingTests() throws Exception {
        driver.quit();
    }

    @Test
    public void enterNumber() throws Exception {
        //TODO:
 //        enter a number under "Number"
//        enter a number under "Number"
          WebElement number = driver.findElement(By.id("h2");
          number.sendKeys("value", "5");
//        driver.findElement(By.id("number")).sendKeys(charSequence."123");
          assertFalse(driver.findElement(By.id("number")).sendKeys(CharSequence."1235");
//        check that button is not clickable "Clear Result"
          assertFalse(driver.findElement(By.id("clear_result_button_number")).isEnabled());
//        check that text is not displayed
          assertFalse(driver.findElement(By.id("clear_element_button_number")).getText();
 //       assertFalse(driver.findElement(By.id("result_number"))....());
          assertFalse(driver.findElement(By.id("result_button_number")).sendKeys(CharSequence."1235");
//        click on "Result" button
          WebElement result_button_number = driver.findElement(By.name());
          result_button_number.click();
//        check that text is displayed
          assertTrue(driver.findElement(By.id("result_button_number")).isDisplayed());
//        check that the correct Text appears ("You entered number: "NUMBER YOU ENTERED"")
          assertEquals("You entered number: \"1235\"", driver.findElement(By.id("result_button__number")).getText());
//       check that the button "Clear Result" is clickable now
          WebElement clear_result_button_number = driver.findElement(By.id("clear_result_button_number"));
          assertTrue(clear_result_button_number.isEnabled());
//        assertTrue(driver.findElement(By.id("clear_result_button_number"))....());
          assertTrue(driver.findElement(By.id("clear_result_button_number"));
//        click on "Clear Result"
          clear_result_button_number.click();
 //       driver.findElement(By.id("clear_result_button_number")).....();
          driver.findElement(By.id("clear_result_button_number")).click();
//        check that the text is still (""), but it is not displayed
          assertEquals("", driver.findElement(By.id("result_number")).getText());
  //      assertFalse(driver.findElement(By.id("result_number")).....());
          assertFalse(driver.findElement(By.id("result_number")).isDisplayed());
    }

    @Test
    public void clickOnLink() throws Exception {
//         TODO:
//        check current url is base_url
//        assertEquals(base_url, driver);
          assertEquals(base_url)
//        click on "This is a link to Homepage"
//       driver.findElement(By.id("homepage_link")).;
//        check that current url is not base_url
         assertFalse(base_url.equals(driver.getCurrentUrl()));
//        verify that current url is homepage
          assertTrue(driver.getCurrentUrl().equals("https://uljanovs.github.io/site/"));
    }
}
