package stepdefinationfile;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resuable.BaseCode;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Hooks extends BaseCode {

    //before start of every scenario
    @Before()
    public void setup() throws IOException {
        System.out.println("Launch Browser");
        BaseCode.launchBrowser();
    }

    @AfterStep()
    public void takeScreenshot(Scenario s){
       byte[] b= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       s.attach(b,"image/png",s.getName());
    }

    @After()
    public void close(){

        driver.close();
    }



}
