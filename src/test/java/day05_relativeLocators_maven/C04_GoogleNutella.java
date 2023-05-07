package day05_relativeLocators_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.annotation.concurrent.ThreadSafe;
import java.time.Duration;

public class C04_GoogleNutella {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://www.google.com/ adresine gidin

        driver.get("https://www.google.com/");

        //2- cookies uyarisini kabul ederek kapatin  (bende cıkmadı gectim)

        //3- Sayfa basliginin “Google” ifadesi icerdigini test edin

        String expectedIcerik= "Google";
        String actuelTitle= driver.getTitle();

        if (actuelTitle.contains(expectedIcerik)){
            System.out.println("title testi PASSED");
        }else {
            System.out.println("title testi FAİLED");
        }

        //4- Arama cubuguna “Nutella” yazip aratin

        WebElement aramaKutusu =driver.findElement(By.xpath("//*[@name='q']"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //5- Bulunan sonuc sayisini yazdirin

        WebElement sonucYaziElementi= driver.findElement(By.id("result-stats"));
        System.out.println(sonucYaziElementi.getText());

        //6- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin

        String sonucYazisiStr= sonucYaziElementi.getText();
        String[] sonucYaziKelimeleriArr = sonucYazisiStr.split(" ");
        String sonucSayiAdediStr=sonucYaziKelimeleriArr[1]; // 124.000.000
        sonucSayiAdediStr = sonucSayiAdediStr.replaceAll("\\D",""); // "124000000"
        int sonucSayisiInt= Integer.parseInt(sonucSayiAdediStr);

        if (sonucSayisiInt>10000000){
            System.out.println("sonuc sayisi testi PASSED");
        }else{
            System.out.println("Sonuc sayisi testi FAILED");
        }
        //7- Sayfayi kapatin

        Thread.sleep(2000);
        driver.close();

    }

}
