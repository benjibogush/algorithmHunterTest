package com.hunter.tests;

import com.hunter.utilities.Driver;
import com.hunter.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ConstantTimeTest {

    @Test
    public void openHunter(){

        Driver.getDriver().get("https://beehab.github.io/src/index.html");

        WebElement textbox = Driver.getDriver().findElement(By.cssSelector("#codeInput"));
        WebElement evaluateBtn = Driver.getDriver().findElement(By.cssSelector("#getBigOBtn"));
        WebElement result = Driver.getDriver().findElement(By.cssSelector("#resultShow"));

        textbox.sendKeys("if(N<10){\n" +
                "println()\n" +
                "}");
        ReusableMethods.sleep(1000);

        evaluateBtn.click();

        String expected= "O(1)";
        String actual = result.getText();

        if(actual.equalsIgnoreCase(expected)){
            System.out.println("Test pass");
        }else{
            System.out.println("Test fail");
        }




//        Driver.getDriver().navigate().to("https://beehab.github.io/src/index.html");


//        WebElement baslik = Driver.getDriver().findElement(By.tagName("h1"));
//        String baslikString = baslik.getText();
//        System.out.println(baslikString);

//        WebElement cevaplananSorular = Driver.getDriver().findElement(By.partialLinkText("50 answered questions"));
//        String cevaplananSorularString = cevaplananSorular.getText();
//        System.out.println(cevaplananSorularString);

//        List<WebElement> linkler = Driver.getDriver().findElements(By.tagName("a"));

//        for(WebElement element : linkler){
//            System.out.println(element.getText());
//        }


        /*
        // 5 sn beklesin
        ReusableMethods.sleep(2000);

        // Başlığı alalım
        String baslik = Driver.getDriver().getTitle();
        System.out.println(baslik);

        // Amazon.com'a gidelim
        Driver.getDriver().navigate().to("https://www.amazon.com");

        // Başlığı alalım
        String baslikAmazon = Driver.getDriver().getTitle();
        System.out.println(baslikAmazon);

        // Google.com'a geri dönelim.
        Driver.getDriver().navigate().back();

        ReusableMethods.sleep(2000);

        // Amazon.com'a geri dönelim.
        Driver.getDriver().navigate().forward();

        // driver classı içerisindeki close methodunu çağırır
        Driver.closeDriver();
        */
    }


}
