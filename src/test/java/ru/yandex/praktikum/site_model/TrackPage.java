package ru.yandex.praktikum.site_model;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TrackPage {
    // WebDriver
    private WebDriver webDriver;
    // Web elements
    // Field for track number input
    private By trackInputField = By.className("Track_Input__1g7lq");
    // Order Not Found board
    private By notFoundBoard = By.className("Track_NotFound__6oaoY");
    // List with order details
    private By orderInfoList = By.className("Track_OrderInfo__2fpDL");
    List<By> listOfLocator = Arrays.asList(By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[1]/div[2]"), // name
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[2]/div[2]"),     // surname
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[3]/div[2]"),     // address
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[4]/div[2]"),     // metro station
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[5]/div[2]"),     // phone number
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[7]/div[2]"),     // delivery date
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[8]/div[2]"),     // delivery duration
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[10]/div[2]"),    // color
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[11]/div[2]"));    // comment
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
    public TrackPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    // Test methods
    public void checkOrderIsActive(Boolean isFound){
        Boolean board = !(webDriver.findElement(notFoundBoard).isDisplayed());
        Boolean table =  webDriver.findElement(orderInfoList).isDisplayed();
        Boolean isNotFoundVisible = board && table;

        Assert.assertEquals(isFound, isNotFoundVisible);
    }
}
