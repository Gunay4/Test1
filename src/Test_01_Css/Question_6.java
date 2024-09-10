package Test_01_Css;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question_6 extends BaseDriver {

  /*
 Go to this site. https://testpages.herokuapp.com/styled/index.html
 Click on Fake Alerts.
 Click on the Show modal dialog button.
 Click on Ok.
 The alert should close.
    */

 @Test
 public void Test1(){

     driver.get("https://testpages.herokuapp.com/styled/index.html");
     Myfunc.Bekle(2);

     WebElement fakealerts= driver.findElement(By.cssSelector("a[id='fakealerttest']"));
     fakealerts.click();
     Myfunc.Bekle(2);
     WebElement modeldialog= driver.findElement(By.cssSelector("[id='modaldialog']"));
     modeldialog.click();
     Myfunc.Bekle(2);

     WebElement okbutton= driver.findElement(By.cssSelector("[id='dialog-ok']"));
     okbutton.click();
     Myfunc.Bekle(2);

     BekleKapat();

 }
}
