package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;

    // bunun şartı extend olması ve basta yer alması
    static  {

        driver=new EdgeDriver();

        //driver.manage().window().maximize(); // Ekranı max yapıyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti

    }

    public static void BekleKapat(){
        Myfunc.Bekle(3);
        driver.quit();

    }
}
