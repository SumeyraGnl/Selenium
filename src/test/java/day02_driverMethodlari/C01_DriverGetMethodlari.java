package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        // sisteme webdriver'in ne olacagını ve bu driver2in hangi dosya yolunda oldugunu soyler

        WebDriver driver=new ChromeDriver();
        // Bilgisayarimizdaki Chrome browser'in otomasyonla calisacak bir kopyasini olusturur
        //Chrome disinda bir browser kullanmak istersek o browser'in driver'ini indirip
        // System.setProperty("webdriver.safari.driver","safari driver'in dosya yolu");

        // Olusturdugumuz driver objesi bizim elimiz, gozumuz gibidir

        driver.get("https://www.amazon.com");  // istenen url'e bizi goturur
        // www yazmazsak da calisir ancak http:// yazmazsak calismaz

        System.out.println(driver.getTitle()); // bize title'i dondurur ---> Amazon.com. Spend less. Smile more.

        System.out.println(driver.getCurrentUrl()); // gidilen URL' i dondurur.  --->https://www.amazon.com/

        System.out.println(driver.getPageSource());  // Gidilen web sayfasinin kaynak kodlarini dondurur.

        System.out.println(driver.getWindowHandle()); // acilan herbir pencereye verilen unique hash code degeridir

        System.out.println(driver.getWindowHandles()); // eger driver calisirken birden fazla pencere veya tab olusturduysa
                                                       // acilan tum windows/tab'lerin unique hash code'larini bir set olarak dondurur


        Thread.sleep(5000); // mili saniye olarak yazdigimiz sayi suresince kodu bekletir
        driver.close(); // acilan browser'i kapatir
    }
}
