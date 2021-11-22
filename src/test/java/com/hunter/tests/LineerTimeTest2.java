package com.hunter.tests;

import com.hunter.utilities.Driver;
import com.hunter.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LineerTimeTest2 {

    @Test
    public void openHunter(){

        Driver.getDriver().get("https://beehab.github.io/src/index.html");

        WebElement textbox = Driver.getDriver().findElement(By.cssSelector("#codeInput"));
        WebElement evaluateBtn = Driver.getDriver().findElement(By.cssSelector("#getBigOBtn"));
        WebElement result = Driver.getDriver().findElement(By.cssSelector("#resultShow"));

        textbox.sendKeys("for(int i = N; i >= 0; i--) {\n" +
                "println(i);\n" +
                "}");
        ReusableMethods.sleep(1000);

        evaluateBtn.click();

        String expected= "O(N)";
        String actual = result.getText();

        if(actual.equalsIgnoreCase(expected)){
            System.out.println("Test pass");
        }else{
            System.out.println("Test fail");
        }




    }


}
