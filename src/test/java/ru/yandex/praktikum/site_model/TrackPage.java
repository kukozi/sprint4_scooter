package ru.yandex.praktikum.site_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TrackPage {
    // WebDriver
    private WebDriver driver;
    // Web elements
    ///*[@id="root"]/div/div[2]/div[2]/div[1]/div[1]/div[2]
    //*[@id="root"]/div/div[2]/div[2]/div[1]/div[2]/div[2]
    //String orderDescriptionXpath = ""
    List<By> listOfLocator = Arrays.asList(By.xpath("/*[@id='root']/div/div[2]/div[2]/div[1]/div[1]/div[2]"), // name
            By.id("/*[@id='root']/div/div[2]/div[2]/div[1]/div[2]/div[2]"),     // surname
            By.id("/*[@id='root']/div/div[2]/div[2]/div[1]/div[3]/div[2]"),     // address
            By.id("/*[@id='root']/div/div[2]/div[2]/div[1]/div[4]/div[2]"),     // metro station
            By.id("/*[@id='root']/div/div[2]/div[2]/div[1]/div[5]/div[2]"),     // phone number
            By.id("/*[@id='root']/div/div[2]/div[2]/div[1]/div[6]/div[2]"),     // delivery date
            By.id("/*[@id='root']/div/div[2]/div[2]/div[1]/div[7]/div[2]"),     // delivery duration
            By.id("/*[@id='root']/div/div[2]/div[2]/div[1]/div[8]/div[2]"),    // color
            By.id("/*[@id='root']/div/div[2]/div[2]/div[1]/div[9]/div[2]"));    // comment
    /* private By orderNumberField = By.className("Input_Input__1iN_Z Track_Input__1g7lq Input_Filled__1rDxs Input_Responsible__1jDKN");
    private By nameLabel = By.xpath("Track_Value__15eEX");
    private By surnameLabel = By.className("Track_Value__15eEX");
    private By addressLabel = By.className("");
    private By metroStationLabel = By.className("");
    private By phoneNumberLabel = By.className("");
    private By deliveryDateLabel = By.className("");
    private By rentDurationLabel = By.className("");
    private By colorLabel = By.className("");
    private By commentLabel = By.className(""); */
    // Test constructor
    public TrackPage(WebDriver driver){
        this.driver = driver;
    }
    // Test methods
}
