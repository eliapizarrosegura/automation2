import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class accessToAutomate {


    public static void main(String[] args) throws Exception {

       FirefoxDriver driver;
       System.setProperty("webdriver.gecko.driver","C://Users/EPI04/Documents/geckodriver.exe");
       driver = new FirefoxDriver();

        //Access to URL
        String url="https://www.google.es/?gws_rd=ssl";
        driver.get(url);

        //Look in Search bar
        By searchBar = By.className("gLFyf");
        String link="http://automationpractice.com/";
        driver.findElement(searchBar).sendKeys(link);
        driver.findElement(searchBar).sendKeys(Keys.ENTER);
        // driver.findElement(By.className("gLFyf")).sendKeys("linkedin");

        //Select the first result
        By cssFirstResult =By.cssSelector("#rso>div:nth-child(1)>div>div>a");

        WebElement firstResults = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(cssFirstResult));
        System.out.println(firstResults.getText());
        firstResults.click();

        //get current URL.
        String currentURL=driver.getCurrentUrl();

        //Send url to create a new account
       NewAccount.newAc(currentURL);

       //close the current windows
       driver.close();

    }


}
