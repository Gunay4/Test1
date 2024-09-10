package Test_01_Css;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question_3 extends BaseDriver {
   /*
 1) Go to this site -> https://www.snapdeal.com/
 2) Search for "teddy bear" and click the Search button.
 3) Verify that this text is visible -> (We've got 297 results for 'teddy bear')
 Note: The number in this text may vary. The important thing is the sentence structure.
 */
 @Test
 public void Test1(){

     driver.get("https://www.snapdeal.com/");

     WebElement teddybear=driver.findElement(By.cssSelector("[class='col-xs-14 search-box-wrapper'] input"));
     teddybear.sendKeys("teddy bear");
     Myfunc.Bekle(2);

     WebElement search=driver.findElement(By.cssSelector("input[id='inputValEnter']+div+button"));
     search.click();
     Myfunc.Bekle(2);

     WebElement yazi= driver.findElement(By.cssSelector("div[id='searchMessageContainer'] span"));
     Assert.assertTrue("Yazı yanlış",yazi.getText().equals("We've got 62 results for teddy bear"));


     BekleKapat();

 }


}
