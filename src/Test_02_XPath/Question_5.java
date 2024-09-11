package Test_02_XPath;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question_5 extends BaseDriver {
   /*
  Go to this website. [https://testpages.herokuapp.com/styled/index.html]
 Click on Fake Alerts.
 Click on Show Alert Box.
 Click on Ok.
 The alert should close.
    */

    @Test
    public void Test(){

      driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakelarts= driver.findElement(By.xpath("//a[text()='Fake Alerts']"));
        fakelarts.click();
        Myfunc.Bekle(2);

        WebElement showalertbox= driver.findElement(By.xpath("(//div[@class='centered']//input)[1]"));
        showalertbox.click();
        Myfunc.Bekle(2);

        WebElement okbutton= driver.findElement(By.xpath("//div[@class='dialog-actions']/button"));
        okbutton.click();
        Myfunc.Bekle(2);

        BekleKapat();

    }



}
