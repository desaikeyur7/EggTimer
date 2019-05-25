package PageObjects;

import EggTimer.BasePage;
import EggTimer.LoadProperties;
import EggTimer.Utils;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    Utils utils = new Utils();
    LoadProperties loadprop = new LoadProperties();

    private By _welcomeImage = By.cssSelector("[src='/images/eggtimer.gif']");
    private By _startATimerField = By.cssSelector("[id='start_a_timer']");
    private By _goOption = By.cssSelector("[id='timergo']");
    private By _promodoroLink = By.cssSelector("[href='/pomodoro']");
    private By _morningLink = By.cssSelector("[href='/morning']");
    private By _brushteethLink = By.cssSelector("[href='/brushteeth']");
    private By _tabataLink = By.cssSelector("[href='/tabata']");

    public void verifyElementsDisplayedOnHomePage(){
        utils.webElementDisplayed(_welcomeImage);
        utils.webElementDisplayed(_startATimerField);
        utils.webElementDisplayed(_goOption);
        utils.webElementDisplayed(_promodoroLink);
        utils.webElementDisplayed(_morningLink);
        utils.webElementDisplayed(_brushteethLink);
        utils.webElementDisplayed(_tabataLink);
    }

    public void enterTimeAndclickGo(String time){
        utils.clearTextFromInputField(_startATimerField);
        utils.inputText(_startATimerField, time);
    }

    public void clickGo(){
        utils.clickElementBy(_goOption);
    }
}


