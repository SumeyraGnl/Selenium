package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
        Selenium 4.7 versiyonu ile kendi driver'ini sisteme ekledi
        Kodlar calismaya basladiginda biz driver icin yol göstermezsek
        Selenium kendi driver'ini devreye sokuyor
        Ama baslangicta driver ayagi aradigi icin biraz yavas calisiyor
         */

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("Baslangicta konum : " + driver.manage().window().getPosition());
        System.out.println("Baslangicta boyut : " + driver.manage().window().getSize());

        Thread.sleep(1000);


        driver.manage().window().maximize();
        System.out.println("Maximize konum : " + driver.manage().window().getPosition());
        System.out.println("Maximize boyut : " + driver.manage().window().getSize());

        Thread.sleep(1000);
        driver.close();



    }
}
