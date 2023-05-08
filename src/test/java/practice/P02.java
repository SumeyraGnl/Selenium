package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
    public static void main(String[] args) {

        //      . .Exercise2...
        //1-Java class'imiza chnomedriver. exetyi tanitalim

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        // 2-Driver oluşturalim

        WebDriver driver=new ChromeDriver();

        // 3-Driver'in tum ekranı kaplamasini sagu ayalim

        driver.manage().window().maximize();

        // 4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        // Egen oncesinde sqyfq Yüklenirse, beklemeyi bıraksın.

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        // 5-"https://www.otto.de" adresine gidelim

        driver.get("https://www.otto.de");

        // 6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim

        String ottoTitle=driver.getTitle();
        System.out.println("otto title : " +ottoTitle);

        String ottoUrl=driver.getCurrentUrl();
        System.out.println("otto url : " +ottoUrl);

        // 7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim

        if (ottoTitle.contains("OTTO") && ottoUrl.contains("OTTO")){
            System.out.println("test PASSED.Her ikiside OTTO icerir");
        }else {
            System.out.println("test FAİLED.En az birinde OTTO yoktur");
        }

        // 8-Ardindan "https://wisequarter.com/" adresine gidip

        driver.navigate().to("https://wisequarter.com/");

        // 9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim

        String wqTitle = driver.getTitle();
        System.out.println("wise quarter title : " +wqTitle);

        Boolean isTrue = wqTitle.contains("Quarter");

        if (isTrue){
            System.out.println("Your Test  PASSED");
        } else {
            System.out.println("Your Test FAILED");
        }

        // 10-Bir onceki web sayfamiza geri donelim

        driver.navigate().back();

        // 11-Sayfayı yenileyelim

        driver.navigate().refresh();

        // 12-Daha sonra web sgyfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim

        driver.navigate().forward();
        System.out.println("All is well");
        driver.close();

        // 13- En son adim olarak butun sayfalarimizi kapatmis olalim

        //driver.quit();


    }
}