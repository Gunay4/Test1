package Test_02_XPath;

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

        WebElement username= driver.findElement(By.xpath("//div[@class='form-group']/input"));
        username.sendKeys("ttechno@gmail.com");
        Myfunc.Bekle(2);

        WebElement password= driver.findElement(By.xpath("(//div[@class='form-group']//input)[2]"));
        password.sendKeys("techno123.");
        Myfunc.Bekle(2);

        WebElement singin= driver.findElement(By.xpath("//div[@class='buttons-w']/a"));
        singin.click();
        Myfunc.Bekle(2);

        Assert.assertTrue("Hatalı başlık",driver.findElement(By.xpath("//h6[text()='Your nearest branch closes in: 30m 5s']")).isDisplayed());
      BekleKapat();


    }

}
