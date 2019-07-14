import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LocatorsInSelenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/Automation/Libraries/Selenium/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://antonregis.com/projects/selenium/finding-elements/locators");
        Thread.sleep(1000);

        // ID locator
        driver.findElement(By.id("edit-submitted-nickname")).sendKeys("test");
        Thread.sleep(1000);
        driver.findElement(By.id("edit-submitted-do-you-like-software-testing-2")).click();
        clickNextButton(driver);

        // Class name locator
        driver.findElement(By.className("random-number-field")).sendKeys("7");
        clickNextButton(driver);

        // Name locator
        driver.findElement(By.name("submitted[email]")).sendKeys("test@antonregis.com");
        clickNextButton(driver);

        // Link locator
        driver.findElement(By.linkText("Section 4")).click();
        Thread.sleep(3000);

        // Partial link locator
        driver.findElement(By.partialLinkText("top of page")).click();
        Thread.sleep(1000);
        clickNextButton(driver);

        // CSS selector locator - selecting an id
        driver.findElement(By.cssSelector("#edit-submitted-time-hour")).sendKeys("7");
        Thread.sleep(1000);

        // CSS selector locator - selecting a class
        driver.findElement(By.cssSelector(".minute")).sendKeys("30");
        Thread.sleep(1000);

        // CSS selector locator - CSS targeting
        driver.findElement(By.cssSelector("div input#edit-submitted-time-ampm-pm")).click();
        clickNextButton(driver);

        // Tag name locator
        driver.findElement(By.tagName("textarea")).sendKeys("The quick brown fox jumps over the lazy dog.");
        clickNextButton(driver);

        // XPath selector
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div/div/div/div/form/div/div[3]/select/option[2]")).click();
        clickDone(driver);

        driver.quit();

    }


    public static void clickNextButton(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("webform-next")).click();
        Thread.sleep(1500);
    }

    public static void clickDone(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("webform-submit")).click();
        Thread.sleep(1500);
    }
    
}
