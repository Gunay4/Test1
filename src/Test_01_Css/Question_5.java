package Test_01_Css;

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
 The alert should close
   */

 @Test
 public void Test1(){

     driver.get("https://testpages.herokuapp.com/styled/index.html");

     WebElement fakealerts= driver.findElement(By.cssSelector("a[id='fakealerttest']"));
     fakealerts.click();
     Myfunc.Bekle(2);
     WebElement alertbox= driver.findElement(By.cssSelector("input[id='fakealert']"));
     alertbox.click();
     Myfunc.Bekle(2);

     WebElement okbutton= driver.findElement(By.cssSelector("[id='dialog-ok']"));
     okbutton.click();
     Myfunc.Bekle(2);

     BekleKapat();
 }



}
