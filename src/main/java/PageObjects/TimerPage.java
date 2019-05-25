package PageObjects;

import EggTimer.BasePage;
import EggTimer.Utils;
import org.openqa.selenium.*;


public class TimerPage extends BasePage {

    Utils utils = new Utils();

    private By _timedisplayed = By.cssSelector("[id='progressText']");

    public void verifyTimeIsDecreasedByOneSecond(){
        utils.waitForElementDisplay(_timedisplayed,5);

        // Count-down timer for looping upto 25 seconds
        int countdown = 25;
        while(countdown-->0) {
            // Declare expected timer text and assign expected value
            String expectedTimerText = "Time Expired!";

            // Waiting for one second before finding the element
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try{

                Alert alert = driver.switchTo().alert();
                System.out.println("Alert box text - "  + alert.getText());
                alert.accept();

                utils.assertTextOfElement(expectedTimerText, _timedisplayed);
                System.out.println("Condition Satisfied..... You can proceed further with your test");


            } catch (NoAlertPresentException noAlert) {
                noAlert.getMessage();
            }
        }

    }

}
