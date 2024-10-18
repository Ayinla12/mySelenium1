package testngPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class google {
    WebDriver driver;
    @BeforeMethod
    public void set(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

    }
    @AfterMethod
    public void close(){
      //  driver.quit();
    }

    @Test
  public void setup(){
        String timeStamp = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
        System.out.println("Google is opened successfully at " + timeStamp);
  driver.get("https://www.google.com/");
        System.out.println("google is opened successfully");

  }
    @Test
    public void secondsetup (){
        String timeStamp = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
        System.out.println("Twitter is opened successfully at " + timeStamp);
      driver.get("https://www.twitter.com/");
        System.out.println("twitter is opened successfully");
  }
    @Test
    public void thirdsetup (){
        String timeStamp = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
        System.out.println("Amazon is opened successfully at " + timeStamp);
        driver.get("https://www.amazon.com/");
        System.out.println("amazon is opened successfully");
        System.out.println("amazon is awesome");

    }
}
