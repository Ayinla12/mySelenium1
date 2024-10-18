package automationExe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class loginWhyRegAi {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@aria-label='Consent']")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
        driver.findElement(By.name("name")).sendKeys("AIA");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("sand@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("192837");
        WebElement dayoptions = driver.findElement(By.id("days"));
        Select pickDay = new Select(dayoptions);
        pickDay.selectByIndex(14);
        WebElement monthoptions = driver.findElement(By.id("months"));
        Select pickMonth = new Select(monthoptions);
        pickMonth.selectByIndex(12);
        WebElement yearoptions = driver.findElement(By.id("years"));
        Select pickYear = new Select(yearoptions);
        pickYear.selectByVisibleText("2000");
        driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
        Actions pageDown = new Actions(driver);
        pageDown.moveToElement(firstname);
        firstname.sendKeys("ade");
        driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("dayo");
        driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("dee1");
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("sunderland");
        WebElement countryoption = driver.findElement(By.xpath("//*[@id=\"country\"]"));
        Select country = new Select(countryoption);
        country.selectByIndex(5);
        driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("sund");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("land");
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("08123456789");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();


    }
}
