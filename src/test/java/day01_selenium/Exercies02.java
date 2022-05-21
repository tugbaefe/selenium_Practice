package day01_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Exercies02 {
    public static void main(String[] args) throws InterruptedException {
        //  ...Exercise2...
//  1-driver olusturalim
//  2-java class'imiza chromedriver.exe'yi tanitalim
//  3-driver'in tum ekrani kaplamasini saglayalim
//  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
//    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//  5-"sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com");
        Thread.sleep(1000);
//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        String sahibindentitle=driver.getTitle();
        System.out.println("sahibindentitle = " + sahibindentitle);
       String sahibindenUrl=driver.getCurrentUrl();
        System.out.println("sahibindenUrl = " + sahibindenUrl);
//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
        if (sahibindentitle.contains("Oto")&&sahibindenUrl.contains("Oto")){
            System.out.println("Oto yazisi testi PASSED");
        }else System.out.println("Oto yazisi testi FAILED");
//  8-Ardindan "gittigidiyor.com" adresine gidelim
        Thread.sleep(2000);
        driver.navigate().to("https://www.gittigidiyor.com");
//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim
        System.out.println(driver.getTitle());
      // boolean isContains=driver.getTitle().contains("Sitesi");
      // if (isContains){
      //     System.out.println("Baslik testi PASSED");
      // }else System.out.println("Baslik testi FAILED");
        String title=driver.getTitle();
        System.out.println(title.contains("Sitesi") ? "PASSED" : "FAILED");

//  10-Bi onceki web sayfamiza geri donelim
        Thread.sleep(2000);
        driver.navigate().back();
//  11-sayfayi yenileyelim
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();
        driver.close();
//  13-En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();


    }
}
