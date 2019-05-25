package EggTimer;

import cucumber.api.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sun.deploy.cache.Cache.copyFile;

public class Utils extends BasePage{


    // Resuable method for click
    public void clickElementBy(By by) {

        driver.findElement(by).click();

    }

    // Reusable method to check if emelent is displayed
    public void webElementDisplayed(By by) {
        try {
            driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Element is not displayed: " + by);
            throw (e);
        }
    }

    // Reusable method to input number in a field
    public void inputText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    // Reusable method to assert text of element
    public void assertTextOfElement(String expected, By by) {
        try {
            String actual = driver.findElement(by).getText();
            Assert.assertEquals(expected, actual);
        } catch (NoSuchElementException e) {
            System.out.println("Invalid Locator OR Element or Text in element is not present: " + by);
            throw (e);
        }
    }

    public void clearTextFromInputField(By by){
        driver.findElement(by).clear();
    }

    // Reusable method for Explicit wait for element to be displayed/visible
    public void waitForElementDisplay(By by, int time) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (NoSuchElementException e) {
            System.out.println("Invalid Locator OR Element is not present within the given wait time: " + by);
            throw (e);
        }
    }

    //Cucumber screenshot method
    public void screenshotOfTheBrowserUsingCucumber(Scenario scenario)
    {
        String timeStamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());
        String screenshotName = scenario.getName().replaceAll("[.,;:?!]", "")+timeStamp+ ".png";
        try
        {
            //This takes a screenshot from the driver at save it to the specified location
            File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //Building up the destination path for the screenshot to save
            //Also make sure to create a folder 'screenshots' within the cucumber-reports folder
            File destinationPath = new File(System.getProperty("user.dir")+
                    "/target/cucumber-reports/extent-reports/screenshots/"+screenshotName+".png");
            //Copy taken screenshot from source location to the destination location
            copyFile(sourcePath,destinationPath );
            scenario.write("!!-----------.......Scenario Failed......----------!! Please see attached screenshot for the error/issue");
            //attach the screenshot to our report
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
