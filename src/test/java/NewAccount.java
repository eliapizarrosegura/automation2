import com.opencsv.CSVReader;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class NewAccount {

    public static void newAc(String currentURL) throws Exception {
        //open new windows
        FirefoxDriver driver;
        //System.setProperty("webdriver.gecko.driver","C://Users/EPI04/Documents/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(currentURL);

        //maximize window
        driver.manage().window().maximize();

        //Click on log in
        By loginButton = By.cssSelector("a.login");
        driver.findElement(loginButton).click();

        //fill the field email and submit button
        By emailField = By.id("email_create");
        By submitButton = By.id("SubmitCreate");

        WebElement email = driver.findElement(emailField);
        email.sendKeys("elips198444@gmail.com");
        driver.findElement(submitButton).click();

        //Click in radio button
        By radioButton= By.id("id_gender2");
        WebElement radio = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(radioButton));
        driver.findElement(radioButton).click();

        //Insert first name, last name, and password
        By firstName = By.id("customer_firstname");
        By lastName = By.id("customer_lastname");
        By pass= By.id("passwd");


        WebElement first= driver.findElement(firstName);
        first.sendKeys("Elia");

        WebElement last = driver.findElement(lastName);
        last.sendKeys("Eli");

        WebElement password= driver.findElement(pass);
        password.sendKeys("contra1234");

        //Select Birth date
        By dayField= By.id("days");
        By monthField= By.id("months");
        By yearField=By.id("years");

        WebElement dday= driver.findElement(dayField);
        Select day= new Select(dday);
        day.selectByIndex(21);

        WebElement mmonth= driver.findElement(monthField);
        Select month= new Select(mmonth);
        month.selectByValue("8");

        WebElement yyear= driver.findElement(yearField);
        Select year= new Select(yyear);
        year.selectByValue("1984");

        //Click in check box
        WebElement newsletterCheck = driver.findElement(By.id("newsletter"));
        WebElement specialOffers= driver.findElement(By.id("optin"));
        newsletterCheck.click();
        //System.out.println(newsletterCheck.isSelected());
        specialOffers.click();

        //Fill the address
        WebElement name = driver.findElement(By.id("firstname"));
        name.sendKeys("Alejandra");

        WebElement lasts = driver.findElement(By.id("lastname"));
        lasts.sendKeys("Finel");

        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Amaris");

        WebElement address= driver.findElement(By.id("address1"));
        address.sendKeys("calle la golosa,27. San Martin (Valladolid)");

        WebElement city=driver.findElement(By.id("city"));
        city.sendKeys("Valladolid");

        WebElement country = driver.findElement(By.id("id_state"));
        Select ccountry= new Select(country);
        ccountry.selectByValue("43");

        WebElement zipcode= driver.findElement(By.id("postcode"));
        zipcode.sendKeys("28200");

        WebElement mPhone= driver.findElement(By.id("phone_mobile"));
        mPhone.sendKeys("912345678");

        WebElement alias= driver.findElement(By.id("alias"));
        alias.sendKeys("mi cuentita");

        for(int i=0; i<4; i++) {
            driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
        }
        screenShotClass.takeSnapShot(driver,"C:\\elia\\screenshot\\firstlogin.png");
        //html.sendKeys(Keys.chord(Keys.CONTROL, "0"));
        Thread.sleep(20000);
        //driver.findElement(By.id("submitAccount")).click();


    }


}
