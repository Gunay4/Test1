package Test_01_Css;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebElement;




public class Question_1 extends BaseDriver {
/*

  1) Go to this site. -> http://demoqa.com/text-box
2) Enter "Automation" in the Full Name field.
3) Enter "Testing@gmail.com" in the Email field.
4) Enter "Testing Current Address" in the Current Address field.
5) Enter "Testing Permanent Address" in the Permanent Address field.
6) Click the Submit button.
7) Verify that the Full Name contains "Automation".
8) Verify that the Email contains "Testing".

*/

    @Test
    public void Test1(){
        //div[id='userName-wrapper'] input")
        driver.get("http://demoqa.com/text-box");

        WebElement name= driver.findElement(By.cssSelector("input[id='userName']"));
        name.sendKeys("Automation");
        System.out.println(name.getText());
        Myfunc.Bekle(3);

        WebElement email= driver.findElement(By.cssSelector("div[id='userEmail-wrapper'] input"));
        email.sendKeys("Testing@gmail.com");
        Myfunc.Bekle(3);


        WebElement currentadres= driver.findElement(By.cssSelector("div[id='currentAddress-wrapper'] textarea"));
        currentadres.sendKeys("Testing Current Address");
        Myfunc.Bekle(3);

        WebElement permanentaddres= driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper'] textarea"));
        permanentaddres.sendKeys("Testing Permanent Address");
        Myfunc.Bekle(3);

        WebElement button=driver.findElement(By.cssSelector("button[id='submit']"));
        button.click();


       Assert.assertTrue(name.isDisplayed()==true);
        Assert.assertTrue(email.isDisplayed()==true);

        Myfunc.Bekle(5);
        BekleKapat();

    }


}
