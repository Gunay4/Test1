package Test_02_XPath;

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
    public void Test() {

        driver.get("https://www.snapdeal.com/");

        WebElement searchbox = driver.findElement(By.xpath("//div[@class='col-xs-14 search-box-wrapper']/input"));
        searchbox.sendKeys("teddy bear");
        Myfunc.Bekle(2);

        WebElement searchbutton = driver.findElement(By.xpath("//div[@class='col-xs-14 search-box-wrapper']/button"));
        searchbutton.click();
        Myfunc.Bekle(2);

        WebElement werite= driver.findElement(By.xpath("(//div[@class='search-result-txt-section  marT12']//span)[1]"));
        Assert.assertTrue("Write could'nt find", werite.isDisplayed());

       BekleKapat();
    }
}
