package Test_02_XPath;

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
    public void Test() {

       driver.get("https://testpages.herokuapp.com/styled/index.html");


        WebElement calculator= driver.findElement(By.xpath("(//div[@class='titledesc']//a)[2]"));
        calculator.click();
        Myfunc.Bekle(2);

        WebElement input1= driver.findElement(By.xpath("//form[@action='calculator']/div[1]/input[1]"));
        input1.sendKeys("23");

        WebElement input2= driver.findElement(By.xpath("//form[@action='calculator']/div[1]/input[2]"));
        input2.sendKeys("2");
        Myfunc.Bekle(2);

        WebElement calculate= driver.findElement(By.xpath("//form[@action='calculator']/div[2]/input[1]"));
        calculate.click();
        Myfunc.Bekle(2);

        WebElement answer= driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println(answer.getText());
        BekleKapat();
    }
}
