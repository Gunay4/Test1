package Test_01_Css;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Question_2 extends BaseDriver {
 /*
 1) Go to this site. -> https://demo.applitools.com/
2) Enter "ttechno@gmail.com" in the Username field.
3) Enter "techno123." in the Password field.
4) Click the "Sign in" button.
5) Verify that "Your nearest branch closes in: 30m 5s" appears.
*/
    @Test
    public void Test1() {

        driver.get("https://demo.applitools.com/");

        WebElement username= driver.findElement(By.cssSelector("input[class='form-control'][placeholder='Enter your username']"));
        username.sendKeys("ttechno@gmail.com");
        Myfunc.Bekle(3);

          //input[class='form-control'][placeholder='Enter your password']
        WebElement password= driver.findElement(By.cssSelector("input[class='form-control'][placeholder='Enter your password']"));
        password.sendKeys("techno123.");
        Myfunc.Bekle(3);

        WebElement singin= driver.findElement(By.cssSelector("[class='buttons-w'] > :nth-child(1)"));
        singin.click();
        Myfunc.Bekle(3);

        WebElement yazikismi= driver.findElement(By.cssSelector("[style='text-align: center;font-size: x-large;color:red']"));
        System.out.println(yazikismi.getText());
        Myfunc.Bekle(3);

        Assert.assertTrue("Yanlış yazı",yazikismi.getText().equals("Your nearest branch closes in: 30m 5s"));
         BekleKapat();

    }


}
