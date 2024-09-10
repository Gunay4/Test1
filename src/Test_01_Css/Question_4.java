package Test_01_Css;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question_4 extends BaseDriver {
 /*
 Go to this website. [https://testpages.herokuapp.com/styled/index.html]
Click Calculate.
Enter any number in the first input.
Enter any number in the second input.
Click Calculate button.
Get the result.
Print the result.
    */
 @Test
 public void Test1(){

     driver.get("https://testpages.herokuapp.com/styled/index.html");

     WebElement caculate= driver.findElement(By.cssSelector("[id='calculatetest'] "));
     caculate.click();
     Myfunc.Bekle(2);

     WebElement input1= driver.findElement(By.cssSelector("div[class='form-label'] > :nth-child(1)"));
     input1.sendKeys("7");
     Myfunc.Bekle(2);

     WebElement input2= driver.findElement(By.cssSelector("div[class='form-label'] > :nth-child(3)"));
     input2.sendKeys("21");
     Myfunc.Bekle(2);

     WebElement count= driver.findElement(By.cssSelector("input[id='calculate']"));
     count.click();
     Myfunc.Bekle(2);

     WebElement answer= driver.findElement(By.cssSelector("span[id='answer']"));
     System.out.println("Answer : "+answer.getText());

    BekleKapat();

 }




}
