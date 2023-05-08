package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {
    public static void main(String[] args) throws InterruptedException {

        // ....Exercise-1:...

        //   Set Path

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");////Bu satırda driver'ımızı tanıttık ve yolunu gösterdik


        //   Create a chrome driver

        WebDriver driver=new ChromeDriver(); //Çalışacağımız tarayıcıyı belirledik.

        //   Maximize window

        driver.manage().window().maximize(); //Bu satırda açılan penceremizi maximum boyuta ulaştırdık. (fullcreen değil)

        //   Open google home page https://www.google.com

        driver.get("https://www.google.com");// Burada gideceğimiz adresi belirledik.
                                             // get ile navigate komutlarını kullanırken
                                             // get komutu daha hızlı çalıştığı için tercih edilir.
                                   // navigate komutu ise daha çok bağımlı durumlarda tercih edilir.

        //   On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google

        driver.navigate().to("https://www.amazon.com ");
        Thread.sleep(2000);
        driver.navigate().back();

        //   Wait about 4 sn

        Thread.sleep(4000);

        //   Navigate forward to amazon

        driver.navigate().forward();
        Thread.sleep(2000);

        //   Refresh page

        driver.navigate().refresh();
        Thread.sleep(2000);

        //   Close/quit the browser

        driver.close(); //Close son açık sayafayı kapatır. quit ise tüm sayfaları kapatır.

        //   And Last step print "All is well" on console

        System.out.println("All is well");
    }
}
