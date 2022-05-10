
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleRandomResult;
import pages.GoogleSearch;


public class TestGoogle2 {

    WebDriver driver;
    @Before
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oskar\\Documents\\Development\\Kodilla\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        WebElement acceptCookies = driver.findElement(By.id("L2AGLb"));
        acceptCookies.click();
    }
    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }
    @Test
    public void testDrawResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        GoogleRandomResult googleRandomResult = new GoogleRandomResult();
        googleSearch.searchResults();
        googleRandomResult.drawResult(googleSearch.getGoogleResults());
    }

}