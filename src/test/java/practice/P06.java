package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P06 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String ht="https://";
        driver.get(ht+"google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().to(ht+"amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        String handle= driver.getWindowHandle();
        System.out.println(driver.getWindowHandle()); // 5BFE5616D518EFAC8EE73DEF23A89FAC
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("wisequarter.com");
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
        driver.switchTo().window(handle);
        driver.close(); // açık olan son browser'ı kapatır.
        // driver.quit(); // birden fazla açılmış browser'ların tümünü kapatır

    }
}
