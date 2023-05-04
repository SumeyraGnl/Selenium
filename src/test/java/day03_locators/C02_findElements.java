package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) throws InterruptedException {

        // Automation Exercise Category Testi
        //1- Bir test class’i olusturun ilgili ayarlari yapin

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");

        //3- Category bolumundeki elementleri locate edin

         List<WebElement> categoryElementList = driver.findElements(By.className("panel-title"));

        //4- Category bolumunde 3 element oldugunu test edin

        int expectedsize=3;
        int actualsize= categoryElementList.size();

        if (expectedsize==actualsize){
            System.out.println("Category element testi PASSED");
        } else{
            System.out.println("Category element testi FAİLED");
        }

        //5- Category isimlerini yazdirin

      /*
        System.out.println(categoryElementList);

        Normalde bir List direk yazdirilabilir
        Ancak findElements() ile bulunan elementler Webelement oldugundan direkt YAZDIRILAMAZ

        bir for-each loop kullanılarak listenin elementleri yazdirilabilir

        element.getText() ile elementlerin isimlerini yazdirabiliriz
       */

        for (WebElement elementEach:categoryElementList
             ) {

            System.out.println(elementEach.getText());

        }

        //6- Sayfayi kapatin

        Thread.sleep(3000);
        driver.close();
    }
}
