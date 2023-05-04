package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locator_findElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1- amazon anasayfasina gidin

        driver.get("https://www.amazon.com");


        /*
        Test otomasyonu yaparken
        bir web elementi kullanmak istersek 2 seye ihtiyacimiz var
        1- o web elementi benzersiz olarak tarif edebileceğimiz bir locator
        2- bu locator'i soyledigimizde bize web elementi bulup getirecek method

        ornegin amazon sitesindeki arama kutusunun unique tarif edicisi olarak
        id = "twotabsearchtextbox" kullanabiliriz

         */

        WebElement aramaKutusuElementi=driver.findElement(By.id("twotabsearchtextbox"));
      // data turu    objenin adi     =     findElement  : webelementi bulan method
      //                                    By : webelementi bulacagımız locator'in turunu yazdigimiz method
      //                                    twotabsearchtextbox : unique tarif icin id attribute degeri


        /*
        findElement() verdigimiz locator turu ve o locator icin verdigimiz degere gore
        webelement'i arar
        locator icin verdigimiz deger hataliysa veya
         locator stratejisinde hata yaptiysak
         aranan web elementi implicitlyWait olarak tanimladigimiz
         maximum sure boyunca arar
         bulamadigi icin "NoSuchElementException" firlatir ve
         kodlarin kalanini calistirmaz
         */

        // 2- arama kutusuna Nutella yazdirin

      aramaKutusuElementi.sendKeys("Nutella");
           //istenen webelement'e istenen yaziyi gonderir


        // 3- enter tusuna basarak arama yapiniz

      aramaKutusuElementi.submit();
          // istenen web elementi uzerinde enter tusuna basar

        Thread.sleep(3000);
        driver.close();
    }
}
