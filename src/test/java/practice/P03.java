package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //     ...Exercise3...
        // Navigate to  https://testpages.herokuapp.com/styled/index.html

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Click on  Calculater under Micro Apps

        driver.findElement(By.id("calculatetest")).click();
        Thread.sleep(2000);

        // Type any number in the first input

        driver.findElement(By.id("number1")).sendKeys("5");
        Thread.sleep(2000);

        // Type any number in the second input

        driver.findElement(By.id("number2")).sendKeys("7");
        Thread.sleep(2000);

        // Click on Calculate

        driver.findElement(By.id("calculate")).click();
        Thread.sleep(2000);

        // Get the result

        String resultElementi = driver.findElement(By.id("answer")).getText();

        // Print the result

        System.out.println("Answer = " +resultElementi);

        driver.close();

    }
}
