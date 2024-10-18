package automationExe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class ebeyMultiplewindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"onetrust-reject-all-handler\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"1707962206997_xa6\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
        Set<String> windowhandles = driver.getWindowHandles();
        Iterator<String> iterate = windowhandles.iterator();
        String parentwindow = iterate.next();
        String childwindow = iterate.next();
        driver.switchTo().window(childwindow);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"rejectInvite\"]")).click();
        driver.findElement(By.name("UserFirstName")).sendKeys("ibrahim");

        //driver.findElement(By.xpath("//*[@id="UserLastName-mM9W"]")).sendKeys("ASD");
        //driver.findElement(By.id("UserFirstName-GX7Q")).sendKeys("qwe");
      //  driver.findElement(By.xpath("//*[@id=\"UserLastName-mM9W\"]")).sendKeys("assd");

    }
}
