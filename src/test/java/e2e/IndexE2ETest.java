package e2e;

import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by IoanKypr on 25/02/14.
 */
public class IndexE2ETest {

    private FirefoxDriver driver;
    private ByAngular ng;

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get("http://localhost:8080");
       // ng = new ByAngular(driver);
//        waitForAngularRequestsToFinish(driver);
    }

    @AfterTest
    public void tear_down() {
        driver.quit();
    }

    @Test
    public void find_multiple_hits_for_ng_repeat_in_page() {
        assertTrue(driver.findElement(By.ByTagName.tagName("body")).getText().contains("Hello"));
    }

}
