package Test_02_XPath;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
public class Question_1 extends BaseDriver {

@Test
public void Test1(){

    driver.get("http://demoqa.com/text-box");

    WebElement name= driver.findElement(By.xpath("//div[@id='userName-wrapper']/div[2]/input"));
    name.sendKeys("Automation");
    Myfunc.Bekle(2);

    WebElement email= driver.findElement(By.xpath("//div[@id='userEmail-wrapper']//input"));
    email.sendKeys("Testing@gmail.com");
    Myfunc.Bekle(2);

    WebElement currentadress= driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']//textarea"));
    currentadress.sendKeys("Testing Current Address");
    Myfunc.Bekle(2);

    WebElement permanentAdress= driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']//textarea"));
    permanentAdress.sendKeys("Testing Permanent Address");
    Myfunc.Bekle(2);

    WebElement submit= driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']/button"));
    submit.click();
    Myfunc.Bekle(2);
    Assert.assertTrue("Hatalı name",driver.findElement(By.xpath("//p[@id='name']")).getText().contains("Automation"));
    Assert.assertTrue("Hatalı email",driver.findElement(By.xpath("//p[@id='email']")).getText().contains("Testing"));
    BekleKapat();
}




}
